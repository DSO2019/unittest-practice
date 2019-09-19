from TortillaHarina import *
import unittest

class TortillaHarinaTest(unittest.TestCase):
    def setUp(self):
        self.tortillaHarina = TortillaHarina()

    def test_CurrentTemperature(self):
        self.tortillaHarina.setCurrentTemperature(21)
        self.assertEqual(21,self.tortillaHarina.getCurrentTemperature())

    def test_FalseToast(self):
        self.tortillaHarina.toast(False)
        self.assertFalse(self.tortillaHarina.isToasted())

    def test_TrueToast(self):
        self.tortillaHarina.toast(True)
        self.assertTrue(self.tortillaHarina.isToasted())

    def test_Toasting(self):
        self.assertEqual(10,self.tortillaHarina.getToastTemperature())