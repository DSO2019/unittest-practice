from mockito import mock, verify, when
import unittest
#   from main.Tortilla2 import *
from quesadilla.main.Quesadilla import Quesadilla
from quesadilla.main.Queso import Queso
from quesadilla.main.Tortilla import Tortilla
from quesadilla.main.Tortilla2 import Tortilla2


class QuesadillaTest(unittest.TestCase):
    def setUp(self):
        self.quesadilla = Quesadilla()
        self.quesadilla_doble = Quesadilla()

        self.mocked_queso = mock(Queso, strict=False)
        self.mocked_tortilla = mock(Tortilla, strict=False)
        self.mocked_tortilla2 = mock(Tortilla, strict=False)

        self.quesadilla.set_queso(self.mocked_queso)
        self.quesadilla.set_tortilla(self.mocked_tortilla)

        self.quesadilla_doble.set_tortilla(self.mocked_tortilla)
        self.quesadilla_doble.set_tortilla2(self.mocked_tortilla2)
        self.quesadilla_doble.set_queso(self.mocked_queso)

    def test_quesadilla_perfecta(self):
        when(self.mocked_queso).is_melted().thenReturn(True)
        when(self.mocked_tortilla).is_toasted().thenReturn(True)
        when(self.mocked_tortilla).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla).get_toasting_temperature().thenReturn(10)
        when(self.mocked_queso).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_queso).get_melting_temperature().thenReturn(10)
        self.assertEquals("Quesadilla perfecta",
                          self.quesadilla.prepare_single())
        verify(self.mocked_tortilla, times=1).toast(True)
        verify(self.mocked_queso, times=1).melt(True)

    def test_quesadilla_buena(self):
        when(self.mocked_queso).is_melted().thenReturn(True)
        when(self.mocked_tortilla).is_toasted().thenReturn(False)
        when(self.mocked_tortilla).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla).get_toasting_temperature().thenReturn(20)
        when(self.mocked_queso).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_queso).get_melting_temperature().thenReturn(10)
        self.assertEquals("Buena quesadilla",
                          self.quesadilla.prepare_single())
        verify(self.mocked_tortilla, times=0).toast(True)
        verify(self.mocked_queso, times=1).melt(True)

    def test_quesadilla_terrible(self):
        when(self.mocked_queso).is_melted().thenReturn(False)
        when(self.mocked_tortilla).is_toasted().thenReturn(True)
        when(self.mocked_tortilla).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla).get_toasting_temperature().thenReturn(20)
        when(self.mocked_queso).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_queso).get_melting_temperature().thenReturn(10)
        self.assertEquals("Quesadilla terrible",
                          self.quesadilla.prepare_single())
        verify(self.mocked_tortilla, times=0).toast(True)
        verify(self.mocked_queso, times=1).melt(True)

    def test_no_hay_gas(self):
        when(self.mocked_queso).is_melted().thenReturn(False)
        when(self.mocked_tortilla).is_toasted().thenReturn(False)
        when(self.mocked_tortilla).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla).get_toasting_temperature().thenReturn(20)
        when(self.mocked_queso).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_queso).get_melting_temperature().thenReturn(10)
        self.assertEquals("You ran out of gas",
                          self.quesadilla.prepare_single())
        verify(self.mocked_tortilla, times=0).toast(True)
        verify(self.mocked_queso, times=1).melt(True)

        # Quesadilla doble

    def test_quesadilla_doble_perfecta(self):
        when(self.mocked_queso).is_melted().thenReturn(True)

        when(self.mocked_tortilla).is_toasted().thenReturn(True)
        when(self.mocked_tortilla).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla).get_toasting_temperature().thenReturn(10)

        when(self.mocked_tortilla2).is_toasted().thenReturn(True)
        when(self.mocked_tortilla2).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla2).get_toasting_temperature().thenReturn(10)
        when(self.mocked_queso).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_queso).get_melting_temperature().thenReturn(10)
        self.assertEquals("Quesadilla doble perfecta",
                          self.quesadilla_doble.prepare_double())
        verify(self.mocked_tortilla, times=1).toast(True)
        verify(self.mocked_tortilla2, times=1).toast(True)
        verify(self.mocked_queso, times=1).melt(True)

    def test_quesadilla_buena_doble_1(self):
        when(self.mocked_queso).is_melted().thenReturn(True)

        when(self.mocked_tortilla).is_toasted().thenReturn(False)
        when(self.mocked_tortilla).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla).get_toasting_temperature().thenReturn(10)

        when(self.mocked_tortilla2).is_toasted().thenReturn(True)
        when(self.mocked_tortilla2).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla2).get_toasting_temperature().thenReturn(10)
        when(self.mocked_queso).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_queso).get_melting_temperature().thenReturn(10)
        self.assertEquals("Buena quesadilla doble 1",
                          self.quesadilla_doble.prepare_double())
        verify(self.mocked_tortilla, times=1).toast(True)
        verify(self.mocked_tortilla2, times=1).toast(True)
        verify(self.mocked_queso, times=1).melt(True)

    def test_quesadilla_buena_doble_2(self):
        when(self.mocked_queso).is_melted().thenReturn(True)

        when(self.mocked_tortilla).is_toasted().thenReturn(True)
        when(self.mocked_tortilla).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla).get_toasting_temperature().thenReturn(10)

        when(self.mocked_tortilla2).is_toasted().thenReturn(False)
        when(self.mocked_tortilla2).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla2).get_toasting_temperature().thenReturn(10)
        when(self.mocked_queso).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_queso).get_melting_temperature().thenReturn(10)
        self.assertEquals("Buena quesadilla doble 2",
                          self.quesadilla_doble.prepare_double())
        verify(self.mocked_tortilla, times=1).toast(True)
        verify(self.mocked_tortilla2, times=1).toast(True)
        verify(self.mocked_queso, times=1).melt(True)

    def test_quesadilla_regular_doble(self):
        when(self.mocked_queso).is_melted().thenReturn(True)

        when(self.mocked_tortilla).is_toasted().thenReturn(False)
        when(self.mocked_tortilla).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla).get_toasting_temperature().thenReturn(10)

        when(self.mocked_tortilla2).is_toasted().thenReturn(False)
        when(self.mocked_tortilla2).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla2).get_toasting_temperature().thenReturn(10)
        when(self.mocked_queso).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_queso).get_melting_temperature().thenReturn(10)
        self.assertEquals("Quesadilla doble regular",
                          self.quesadilla_doble.prepare_double())
        verify(self.mocked_tortilla, times=1).toast(True)
        verify(self.mocked_tortilla2, times=1).toast(True)
        verify(self.mocked_queso, times=1).melt(True)

    def test_quesadilla_mala_doble(self):
        when(self.mocked_queso).is_melted().thenReturn(False)

        when(self.mocked_tortilla).is_toasted().thenReturn(True)
        when(self.mocked_tortilla).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla).get_toasting_temperature().thenReturn(10)

        when(self.mocked_tortilla2).is_toasted().thenReturn(True)
        when(self.mocked_tortilla2).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla2).get_toasting_temperature().thenReturn(10)
        when(self.mocked_queso).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_queso).get_melting_temperature().thenReturn(10)
        self.assertEquals("Quesadilla doble mala",
                          self.quesadilla_doble.prepare_double())
        verify(self.mocked_tortilla, times=1).toast(True)
        verify(self.mocked_tortilla2, times=1).toast(True)
        verify(self.mocked_queso, times=1).melt(True)

    def test_quesadilla_terrible_doble_1(self):
        when(self.mocked_queso).is_melted().thenReturn(False)

        when(self.mocked_tortilla).is_toasted().thenReturn(False)
        when(self.mocked_tortilla).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla).get_toasting_temperature().thenReturn(10)

        when(self.mocked_tortilla2).is_toasted().thenReturn(True)
        when(self.mocked_tortilla2).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla2).get_toasting_temperature().thenReturn(10)
        when(self.mocked_queso).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_queso).get_melting_temperature().thenReturn(10)
        self.assertEquals("Quesadilla doble terrible 1",
                          self.quesadilla_doble.prepare_double())
        verify(self.mocked_tortilla, times=1).toast(True)
        verify(self.mocked_tortilla2, times=1).toast(True)
        verify(self.mocked_queso, times=1).melt(True)

    def test_quesadilla_terrible_doble_2(self):
        when(self.mocked_queso).is_melted().thenReturn(False)

        when(self.mocked_tortilla).is_toasted().thenReturn(True)
        when(self.mocked_tortilla).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla).get_toasting_temperature().thenReturn(10)

        when(self.mocked_tortilla2).is_toasted().thenReturn(False)
        when(self.mocked_tortilla2).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla2).get_toasting_temperature().thenReturn(10)
        when(self.mocked_queso).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_queso).get_melting_temperature().thenReturn(10)
        self.assertEquals("Quesadilla doble terrible 2",
                          self.quesadilla_doble.prepare_double())
        verify(self.mocked_tortilla, times=1).toast(True)
        verify(self.mocked_tortilla2, times=1).toast(True)
        verify(self.mocked_queso, times=1).melt(True)

    def test_no_hay_gas_doble(self):
        when(self.mocked_queso).is_melted().thenReturn(False)

        when(self.mocked_tortilla).is_toasted().thenReturn(False)
        when(self.mocked_tortilla).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla).get_toasting_temperature().thenReturn(10)

        when(self.mocked_tortilla2).is_toasted().thenReturn(False)
        when(self.mocked_tortilla2).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_tortilla2).get_toasting_temperature().thenReturn(10)
        when(self.mocked_queso).get_current_temperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mocked_queso).get_melting_temperature().thenReturn(10)
        self.assertEquals("Quesadilla doble sin gas",
                          self.quesadilla_doble.prepare_double())
        verify(self.mocked_tortilla, times=1).toast(True)
        verify(self.mocked_tortilla2, times=1).toast(True)
        verify(self.mocked_queso, times=1).melt(True)
