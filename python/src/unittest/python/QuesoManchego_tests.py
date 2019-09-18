from mockito import when, mock, verify,assertEquals,assertFalse,assertTrue
from ...main.python import QuesoManchego
import unittest

class QuesoManchegoTest(unittest.TestCase):
    def setUp(self):
        self.quesoManchego = QuesoManchego()

    def test_CurrentTemperature(self):
        self.quesoManchego.setCurrentTemperature(21)
        assertEquals(21,self.quesoManchego.getCurrentTemperature())

    def test_CurrentTemperature(self):
        self.quesoManchego.setCurrentTemperature(21)
        assertEquals(21,self.quesoManchego.getCurrentTemperature())
    
    def test_FalseMelt(self):
        self.quesoManchego.melt(False)
        assertFalse(self.quesoManchego.isMelted())
    
    def test_TrueMelt(self):
        self.quesoManchego.melt(True)
        assertTrue(self.quesoManchego.isMelted())
    
    def test_Melting(self):
        assertEquals(20,self.quesoManchego.getMeltingTemperature())
    