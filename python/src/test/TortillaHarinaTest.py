import unittest
from TortillaHarina import *

class TortillaHarinaTest(unittest.TestCase):
    def setUp(self):
        self.tortillaHarina = TortillaHarina()

    def testCurrentTemperature(self):
        self.tortillaHarina.setCurrentTemperature(21)
        self.assertEqual(21,self.tortillaHarina.getCurrentTemperature())

    def testFalseToast(self):
        self.tortillaHarina.toast(False)
        self.assertFalse(self.tortillaHarina.isToasted())

    def testTrueToast(self):
        self.tortillaHarina.toast(True)
        self.assertTrue(self.tortillaHarina.isToasted())

    def testToasting(self):
        self.assertEqual(10,self.tortillaHarina.getToastTemperature())