import unittest
from QuesoChihuahua import *

class QuesoChihuahuaTest(unittest.TestCase):
    def setUp(self):
        self.quesoChihuahua = QuesoChihuahua()

    def test_CurrentTemperature(self):
        self.quesoChihuahua.setCurrentTemperature(21)
        self.assertEquals(21, self.quesoChihuahua.getCurrentTemperature())

    def test_CurrentTemperature(self):
        self.quesoChihuahua.setCurrentTemperature(21)
        self.assertEquals(21, self.quesoChihuahua.getCurrentTemperature())

    def test_FalseMelt(self):
        self.quesoChihuahua.melt(False)
        self.assertFalse(self.quesoChihuahua.isMelted())

    def test_TrueMelt(self):
        self.quesoChihuahua.melt(True)
        self.assertTrue(self.quesoChihuahua.isMelted())

    def test_Melting(self):
        self.assertEquals(20, self.quesoChihuahua.getMeltingTemperature())
