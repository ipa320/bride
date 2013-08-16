/*
 [The "BSD licence"]
 Copyright (c) 2005-2006 Terence Parr
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.ros.model.ros_package.dsl.indenting;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CharStream;

/**
 * A pretty quick CharStream that pulls all data from an array directly. Every
 * method call counts in the lexer. Java's strings aren't very good so I'm
 * avoiding.
 */
public class IndentingStream implements CharStream {
	private static final int INDENT = '<';
	private static final int DEDENT = '>';

	/** The data being scanned */
	protected char[] data;

	/** How many characters are actually in the buffer */
	protected int n;

	/** 0..n-1 index into string of next char */
	protected int p = 0;

	/** line number 1..n within the input */
	protected int line = 1;

	/** The index of the character relative to the beginning of the line 0..n-1 */
	protected int charPositionInLine = 0;

	/** tracks how deep mark() calls are nested */
	protected int markDepth = 0;

	/**
	 * A list of CharStreamState objects that tracks the stream state values
	 * line, charPositionInLine, and p that can change as you move through the
	 * input stream. Indexed from 1..markDepth. A null is kept @ index 0. Create
	 * upon first call to mark().
	 */
	protected List<CharStreamState> markers;

	/** Track the last mark() call result value for use in rewind(). */
	protected int lastMarker;

	private int[] indents;

	private int[] dedents;

	public IndentingStream(CharStream arg0) {
		System.out.println("IndentStream start: " + arg0.toString());
		this.data = arg0.substring(0, arg0.size() - 1).toCharArray();
		Tokenizer tokenizer = new Tokenizer(new String(data).getBytes());
		indents = tokenizer.getIndents();
		dedents = tokenizer.getDedents();
		this.n = arg0.size() + indents.length + dedents.length;
	}

	/**
	 * Reset the stream so that it's in the same state it was when the object
	 * was created *except* the data array is not touched.
	 */
	public void reset() {
		p = 0;
		line = 1;
		charPositionInLine = 0;
		markDepth = 0;
	}

	public void consume() {
		if (p < n) {
			int actualChar = getActualChar(1);
			if (actualChar != INDENT && actualChar != DEDENT)
				charPositionInLine++;
			if (actualChar == '\n') {
				line++;
				charPositionInLine = 0;
			}
			p++;
		}
	}

	public int LA(int i) {
		if (i == 0) {
			return 0; // undefined
		}
		if (i < 0) {
			i++; // e.g., translate LA(-1) to use offset i=0; then data[p+0-1]
			if (p + i - 1 < 0) {
				return CharStream.EOF; // invalid; no char before first char
			}
		}

		if (p + i - 1 >= n) {
			return CharStream.EOF;
		}
		return getActualChar(i);
	}

	private int getActualChar(int i) {
		int y = p + i - 1;
		int x = y;
		for (int j = 0; j < indents.length; j++) {
			if (indents[j] == y)
				return INDENT;
			if (indents[j] > y)
				break;
			x -= 1;
		}
		for (int j = 0; j < dedents.length; j++) {
			if (dedents[j] == y)
				return DEDENT;
			if (dedents[j] > y)
				break;
			x -= 1;
		}
		return data[x];
	}

	public int LT(int i) {
		return LA(i);
	}

	/**
	 * Return the current input symbol index 0..n where n indicates the last
	 * symbol has been read. The index is the index of char to be returned from
	 * LA(1).
	 */
	public int index() {
		return getRealPosition(p);
	}

	private int getRealPosition(int y) {
		int x = y;
		for (int j = 0; j < indents.length; j++) {
			if (indents[j] > y)
				break;
			x -= 1;
		}
		for (int j = 0; j < dedents.length; j++) {
			if (dedents[j] > y)
				break;
			x -= 1;
		}
		return x;
	}

	public int size() {
		return n;
	}

	public int mark() {
		if (markers == null) {
			markers = new ArrayList<CharStreamState>();
			markers.add(null); // depth 0 means no backtracking, leave blank
		}
		markDepth++;
		CharStreamState state = null;
		if (markDepth >= markers.size()) {
			state = new CharStreamState();
			markers.add(state);
		} else {
			state = (CharStreamState) markers.get(markDepth);
		}
		state.p = p;
		state.line = line;
		state.charPositionInLine = charPositionInLine;
		lastMarker = markDepth;
		return markDepth;
	}

	public void rewind(int m) {
		CharStreamState state = (CharStreamState) markers.get(m);
		// restore stream state
		seek(state.p);
		line = state.line;
		charPositionInLine = state.charPositionInLine;
		release(m);
	}

	public void rewind() {
		rewind(lastMarker);
	}

	public void release(int marker) {
		// unwind any other markers made after m and release m
		markDepth = marker;
		// release this marker
		markDepth--;
	}

	/**
	 * consume() ahead until p==index; can't just set p=index as we must update
	 * line and charPositionInLine.
	 */
	public void seek(int index) {
		if (index <= p) {
			p = index; // just jump; don't update stream state (line, ...)
			return;
		}
		// seek forward, consume until p hits index
		while (p < index) {
			consume();
		}
	}

	public String substring(int start, int stop) {
		return new String(data, start, stop - start + 1);
	}

	public int getLine() {
		return line;
	}

	public int getCharPositionInLine() {
		return charPositionInLine;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public void setCharPositionInLine(int pos) {
		this.charPositionInLine = pos;
	}

	@Override
	public String getSourceName() {
		// TODO Auto-generated method stub
		return null;
	}
}
