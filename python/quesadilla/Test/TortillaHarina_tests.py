import unittest
from main.TortillaHarina import TortillaHarina


class tortilla_harina_test(unittest.TestCase):

    def setUp(self):
        self.tortillaHarina = TortillaHarina()

    def test_current_temperature(self):
        self.tortillaHarina.set_current_temperature(21)
        self.assertEquals(21, self.tortillaHarina.get_current_temperature())

    def test_false_melt(self):
        self.tortillaHarina.toast(False)
        self.assertFalse(self.tortillaHarina.is_toasted())

    def test_true_melt(self):
        self.tortillaHarina.toast(True)
        self.assertTrue(self.tortillaHarina.is_toasted())

    def test_melting(self):
        self.assertEquals(20, self.tortillaHarina.get_toasting_temperature())
