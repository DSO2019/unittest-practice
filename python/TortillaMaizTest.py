import unittest
from TortillaMaiz import TortillaMaiz


class TortillaHarinaTest(unittest.TestCase):
    tortillaMaiz = TortillaMaiz()

    def testCurrentTemperature(self):
        self.tortillaMaiz.setCurrentTemperature(21)
        self.assertEqual(21, self.tortillaMaiz.getCurrentTemperature())

    def testFalseToast(self):
        self.tortillaMaiz.toast(False)
        self.assertFalse(self.tortillaMaiz.isToasted())

    def testTrueToast(self):
        self.tortillaMaiz.toast(True)
        self.assertTrue(self.tortillaMaiz.isToasted())

    def testToasting(self):
        self.assertEqual(40, self.tortillaMaiz.getToastTemperature())
