import unittest
from main.QuesoChihuahua import QuesoChihuahua


class queso_chihuahua_test(unittest.TestCase):

    def setUp(self):
        self.quesoChihuahua = QuesoChihuahua()

    def test_current_temperature(self):
        self.quesoChihuahua.set_current_temperature(21)
        self.assertEquals(21, self.quesoChihuahua.get_current_temperature())

    def test_false_melt(self):
        self.quesoChihuahua.melt(False)
        self.assertFalse(self.quesoChihuahua.is_melted())

    def test_true_melt(self):
        self.quesoChihuahua.melt(True)
        self.assertTrue(self.quesoChihuahua.is_melted())

    def test_melting(self):
        self.assertEquals(20, self.quesoChihuahua.get_melting_temperature())
