from mockito import when, mock, verify,assertEquals,assertFalse,assertTrue
from ...main.python import QuesoManchego
import unittest

class QuesoManchegoTest(unittest.TestCase):
    def __init__(self):
        self.quesoManchego = QuesoManchego()

    def testCurrentTemperature(self):
        self.quesoManchego.setCurrentTemperature(21)
        assertEquals(21,self.quesoManchego.getCurrentTemperature())

    def testCurrentTemperature(self):
        self.quesoManchego.setCurrentTemperature(21)
        assertEquals(21,self.quesoManchego.getCurrentTemperature())
    
    def testFalseMelt(self):
        self.quesoManchego.melt(False)
        assertFalse(self.quesoManchego.isMelted())
    
    def testTrueMelt(self):
        self.quesoManchego.melt(True)
        assertTrue(self.quesoManchego.isMelted())
    
    def testMelting(self):
        assertEquals(20,self.quesoManchego.getMeltingTemperature())
    