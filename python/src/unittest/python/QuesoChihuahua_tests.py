from mockito import when, mock, verify,assertEquals,assertFalse,assertTrue
from ...main.python import QuesoChihuahua
import unittest

class QuesoChihuahuaTest(unittest.TestCase):
    def setUp(self):
        self.quesoChihuahua = QuesoChihuahua()

    def test_CurrentTemperature(self):
        self.quesoChihuahua.setCurrentTemperature(21)
        assertEquals(21,self.quesoChihuahua.getCurrentTemperature())

    def test_CurrentTemperature(self):
        self.quesoChihuahua.setCurrentTemperature(21)
        assertEquals(21,self.quesoChihuahua.getCurrentTemperature())
    
    def test_FalseMelt(self):
        self.quesoChihuahua.melt(False)
        assertFalse(self.quesoChihuahua.isMelted())
    
    def test_TrueMelt(self):
        self.quesoChihuahua.melt(True)
        assertTrue(self.quesoChihuahua.isMelted())
    
    def test_Melting(self):
        assertEquals(20,self.quesoChihuahua.getMeltingTemperature())
    