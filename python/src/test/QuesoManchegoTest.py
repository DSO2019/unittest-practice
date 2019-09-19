import unittest
from QuesoManchego import *

class QuesoManchegoTest(unittest.TestCase):
    def setUp(self):
        self.quesoManchego = QuesoManchego()

    def testCurrentTemperature(self):
        self.quesoManchego.setCurrentTemperature(21)
        self.assertEqual(21, self.quesoManchego.getCurrentTemperature())

    def testCurrentTemperature(self):
        self.quesoManchego.setCurrentTemperature(21)
        self.assertEqual(21, self.quesoManchego.getCurrentTemperature())

    def testFalseMelt(self):
        self.quesoManchego.melt(False)
        self.assertFalse(self.quesoManchego.isMelted())

    def testTrueMelt(self):
        self.quesoManchego.melt(True)
        self.assertTrue(self.quesoManchego.isMelted())

    def testMelting(self):
        self.assertEqual(20, self.quesoManchego.getMeltingTemperature())