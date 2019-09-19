import unittest
from QuesoChihuahua import *

class QuesoChihuahuaTest(unittest.TestCase):
    def setUp(self):
        self.quesoChihuahua = QuesoChihuahua()

    def testCurrentTemperature(self):
        self.quesoChihuahua.setCurrentTemperature(21)
        self.assertEqual(21, self.quesoChihuahua.getCurrentTemperature())

    def testCurrentTemperature(self):
        self.quesoChihuahua.setCurrentTemperature(21)
        self.assertEqual(21, self.quesoChihuahua.getCurrentTemperature())

    def testFalseMelt(self):
        self.quesoChihuahua.melt(False)
        self.assertFalse(self.quesoChihuahua.isMelted())

    def testTrueMelt(self):
        self.quesoChihuahua.melt(True)
        self.assertTrue(self.quesoChihuahua.isMelted())

    def testMelting(self):
        self.assertEqual(20, self.quesoChihuahua.getMeltingTemperature())