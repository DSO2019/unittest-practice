import unittest
from main.QuesoManchego import QuesoManchego


class queso_Manchego_test(unittest.TestCase):

    def setUp(self):
        self.quesoManchego = QuesoManchego()

    def test_current_temperature(self):
        self.quesoManchego.set_current_temperature(21)
        self.assertEquals(21, self.quesoManchego.get_current_temperature())

    def test_false_melt(self):
        self.quesoManchego.melt(False)
        self.assertFalse(self.quesoManchego.is_melted())

    def test_true_melt(self):
        self.quesoManchego.melt(True)
        self.assertTrue(self.quesoManchego.is_melted())

    def test_melting(self):
        self.assertEquals(20, self.quesoManchego.get_melting_temperature())
