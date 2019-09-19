import unittest
from QuesoChihuahua import QuesoChihuahua

class QuesoChihuahuaTest(unittest.TestCase):
	quesoChihuahua = QuesoChihuahua()

	def testCurrentTemperature(self):
		self.quesoChihuahua.setCurrentTemperature(21)
		assert self.quesoChihuahua.getCurrentTemperature() == 21

	def testFalseMelt(self):
		self.quesoChihuahua.melt(False)
		self.assertFalse(self.quesoChihuahua.isMelted())

	def testTrueMelt(self):
		self.quesoChihuahua.melt(True)
		self.assertTrue(self.quesoChihuahua.isMelted())

	def testMelting(self):
		self.assertEqual(20, self.quesoChihuahua.getMeltingTemperature())