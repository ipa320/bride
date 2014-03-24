import unittest
import subprocess
import roscreate

class TestGenerateTalkerPackage(unittest.TestCase):
	def test_roscreate_pkg(self):
		assert(subprocess.call(["cd", "/Users/bubi/git/care-o-bot/bride/bride_tutorials"]) == 0)
		assert(subprocess.call(["cd", ".."]) == 0)
		assert(subprocess.call(["/opt/ros/groovy/bin/roscreate-pkg ", "talker"]) == 0)


	def run_code_generation(self):
		pass


if __name__ == '__main__':
    unittest.main()