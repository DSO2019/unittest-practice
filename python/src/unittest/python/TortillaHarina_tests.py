from ...main.python import TortillaHarina
import unittest

class TortillaHarina_test(unittest.TestCase):
    def setUp(self):
        self.tortillaHarina = TortillaHarina()

    def test_CurrentTemperature(self):
        self.tortillaHarina.setCurrentTemperature(21)
        assertEqual(21,self.tortillaHarina.getCurrentTemperature())

    def test_FalseToast(self):
        self.tortillaHarina.toast(False)
        assertFalse(self.tortillaHarina.isToasted())

    def test_TrueToast(self):
        self.tortillaHarina.toast(True)
        assertTrue(self.tortillaHarina.isToasted())

    def test_Toasting(self):
        assertEqual(10,self.tortillaHarina.getToastTemperature())
