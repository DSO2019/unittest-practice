from mockito import when, mock, verify,assertEquals,assertFalse,assertTrue
from ...main.python import TortillaMaiz
import unittest

class TortillaMaizTest(unittest.TestCase):
    def __init__(self):
        self.tortillaMaiz = TortillaMaiz()

    def testCurrentTemperature(self):
        self.tortillaMaiz.setCurrentTemperature(21)
        assertEquals(21,self.tortillaMaiz.getCurrentTemperature())

    def testFalseToast(self):
        self.tortillaMaiz.toast(False)
        assertFalse(self.tortillaMaiz.isToasted())

    def testTrueToast(self):
        self.tortillaMaiz.toast(True)
        assertTrue(self.tortillaMaiz.isToasted())

    def testToasting(self):
        assertEquals(10,self.tortillaMaiz.getToastTemperature())
