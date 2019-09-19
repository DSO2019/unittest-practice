import unittest
from QuesoManchego import QuesoManchego

class QuesoManchegoTest(unittest.TestCase):
	quesoManchego = QuesoManchego()

	def testCurrentTemperature(self):
		self.quesoManchego.setCurrentTemperature(25)
		assert self.quesoManchego.getCurrentTemperature() == 25

	def testFalseMelt(self):
		self.quesoManchego.melt(False)
		self.assertFalse(self.quesoManchego.isMelted())

	def testTrueMelt(self):
		self.quesoManchego.melt(True)
		self.assertTrue(self.quesoManchego.isMelted())

	def testMelting(self):
		self.assertEqual(21, self.quesoManchego.getMeltingTemperature())