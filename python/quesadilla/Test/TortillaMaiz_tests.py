import unittest
from main.TortillaMaiz import TortillaMaiz


class tortilla_maiz_test(unittest.TestCase):

    def setUp(self):
        self.tortillaMaiz = TortillaMaiz()

    def test_current_temperature(self):
        self.tortillaMaiz.set_current_temperature(21)
        self.assertEquals(21, self.tortillaMaiz.get_current_temperature())

    def test_false_melt(self):
        self.tortillaMaiz.toast(False)
        self.assertFalse(self.tortillaMaiz.is_toasted())

    def test_true_melt(self):
        self.tortillaMaiz.toast(True)
        self.assertTrue(self.tortillaMaiz.is_toasted())

    def test_melting(self):
        self.assertEquals(20, self.tortillaMaiz.get_toasting_temperature())
