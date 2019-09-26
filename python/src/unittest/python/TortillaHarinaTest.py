from TortillaHarina import *
from mockito import when, mock, verify,assertEquals,assertFalse,assertTrue
import unittest
class TortillaHarinaTest(unittest.TestCase):
    def __init__(self):
        self.tortillaHarina = TortillaHarina()

    def testCurrentTemperature(self):
        self.tortillaHarina.setCurrentTemperature(11)
        assertEquals(11,self.tortillaHarina.getCurrentTemperature())

    def testFalseToast(self):
        self.tortillaHarina.toast(False)
        assertFalse(self.tortillaHarina.isToasted())

    def testTrueToast(self):
        self.tortillaHarina.toast(True)
        assertTrue(self.tortillaHarina.isToasted())

    def testToasting(self):
        assertEquals(10,self.tortillaHarina.getToastTemperature())