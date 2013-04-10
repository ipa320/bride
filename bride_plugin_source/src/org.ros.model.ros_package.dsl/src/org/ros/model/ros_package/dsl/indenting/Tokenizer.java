package org.ros.model.ros_package.dsl.indenting;

import java.util.Stack;

public class Tokenizer {

	private static class ByteArrayWrapper {

		private final byte[] input;
		private int pos;

		public ByteArrayWrapper(byte[] input) {
			this.input = input;
			this.pos = 0 ;
		}

		public int read() {
			if (this.pos < input.length)
				return input[this.pos++];
			return -1;
		}

		public long skip(int n) {
			if (this.pos + n >= 0 && this.pos + n < input.length) {
				this.pos += n ;
				return n ;
			}
			return 0;
		}
		
	};
	
	private static final int TAB_SIZE = 4;

	private static int SIZE = 1024;

	private Stack<Integer> indentTracker = new Stack<Integer>();

	private int[] indents = new int[SIZE];
	private int nIndents = 0;
	private int[] dedents = new int[SIZE];
	private int nDedents = 0;

	private int indentPos = 0;

	public int[] getIndents() {
		return indents = compress(indents, nIndents);
	}

	public int[] getDedents() {
		return dedents = compress(dedents, nDedents);
	}

	private int[] compress(int[] array, int size) {
		if (size == array.length)
			return array;
		int[] newArray = new int[size];
		System.arraycopy(array, 0, newArray, 0, size);
		return newArray;
	}

	public Tokenizer(byte[] input) {
		ByteArrayWrapper in = new ByteArrayWrapper(input);
		int c;
		while ((c = read(in)) != -1) {
			if (c == '\n') {
				int indent = gatherIndent(in);
				if (indent == -1)
					break;
				int curIndent;
				if (indentTracker.size() != 0)
					curIndent = indentTracker.peek();
				else
					curIndent = 0;
				if (curIndent < indent) {
					addIndent(indent);
				} else if (curIndent > indent) {
					addDedent(curIndent, indent);
				}
			}
		}
		if (indentTracker.size() != 0) {
			addDedent(indentTracker.peek(), 0);
		}
	}

	private int read(ByteArrayWrapper in) {
		int c = in.read();
		if (c != -1) {
			indentPos++;
		}
		return c;
	}

	private void addDedent(int curIndent, int indent) {
		if (indent == 0) {
			int n = indentTracker.size();
			for (int i = 0; i < n; i++) {
				dedents[nDedents++] = indentPos++;
			}
			indentTracker.clear();
		} else {
			if (indentTracker.indexOf(indent) == -1)
				throw new RuntimeException("Invalid dedent");
			while (indent != indentTracker.peek()) {
				dedents[nDedents++] = indentPos++;
				indentTracker.pop();
			}
		}
	}

	private void addIndent(int indent) {
		indentTracker.push(indent);
		indents[nIndents++] = indentPos;
		indentPos++;
	}

	private int gatherIndent(ByteArrayWrapper in) {
		int column = 0;
		int c;
		while ((c = read(in)) != -1) {
			if (c == '\n')
				column = 0;
			else if (c == ' ')
				column++;
			else if (c == '\t')
				column = (column / TAB_SIZE + 1) * TAB_SIZE;
			else {
				in.skip(-1);
				indentPos--;
				return column;
			}
		}
		return -1;
	}
}
