from TortillaMaiz import *
from mockito import when, mock, verify,assertEquals,assertFalse,assertTrue
import unittest
class TortillaMaizTest(unittest.TestCase):
    def __init__(self):
        self.tortillaMaiz = TortillaMaiz()

    def testCurrentTemperature(self):
        self.tortillaMaiz.setCurrentTemperature(11)
        assertEquals(11,self.tortillaMaiz.getCurrentTemperature())

    def testFalseToast(self):
        self.tortillaMaiz.toast(False)
        assertFalse(self.tortillaMaiz.isToasted())

    def testTrueToast(self):
        self.tortillaMaiz.toast(True)
        assertTrue(self.tortillaMaiz.isToasted())

    def testToasting(self):
        assertEquals(10,self.tortillaMaiz.getToastTemperature())