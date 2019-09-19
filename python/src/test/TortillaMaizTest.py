import unittest
from TortillaMaiz import *

class TortillaMaizTest(unittest.TestCase):
    def setUp(self):
        self.tortillaMaiz = TortillaMaiz()

    def testCurrentTemperature(self):
        self.tortillaMaiz.setCurrentTemperature(21)
        self.assertEqual(21,self.tortillaMaiz.getCurrentTemperature())

    def testFalseToast(self):
        self.tortillaMaiz.toast(False)
        self.assertFalse(self.tortillaMaiz.isToasted())

    def testTrueToast(self):
        self.tortillaMaiz.toast(True)
        self.assertTrue(self.tortillaMaiz.isToasted())

    def testToasting(self):
        self.assertEqual(10,self.tortillaMaiz.getToastTemperature())