from ...main.python import TortillaMaiz
import unittest

class TortillaMaiz_test(unittest.TestCase):
    def setUp(self):
        self.tortillaMaiz = TortillaMaiz()

    def test_CurrentTemperature(self):
        self.tortillaMaiz.setCurrentTemperature(21)
        assertEqual(21,self.tortillaMaiz.getCurrentTemperature())

    def test_FalseToast(self):
        self.tortillaMaiz.toast(False)
        assertFalse(self.tortillaMaiz.isToasted())

    def test_TrueToast(self):
        self.tortillaMaiz.toast(True)
        assertTrue(self.tortillaMaiz.isToasted())

    def test_Toasting(self):
        assertEqual(10,self.tortillaMaiz.getToastTemperature())
