import unittest
from Quesadilla import *
from Queso import *
from Tortilla import *
from mockito import mock, verify, when


class QuesadillaTest(unittest.TestCase):
    def setUp(self):
        self.quesadilla = Quesadilla()
        self.quesadillaDoble = Quesadilla()
        self.mockedQueso = mock(Queso, strict=False)
        self.mockedQuesoDoble = mock(Queso, strict=False)
        self.mockedTortilla = mock(Tortilla, strict=False)
        self.mockedTortilla1 = mock(Tortilla, strict=False)
        self.mockedTortilla2 = mock(Tortilla, strict=False)
        self.quesadilla.setQueso(self.mockedQueso)
        self.quesadilla.setTortilla(self.mockedTortilla)
        self.quesadillaDoble.setQueso(self.mockedQuesoDoble)
        self.quesadillaDoble.setTortillas(self.mockedTortilla1,
                                          self.mockedTortilla2)

    def test_quesadillaPerfecta(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        self.assertEquals("Perfect quesadilla",
                          self.quesadilla.prepareSingle())
        verify(self.mockedTortilla, times=1).toast(True)
        verify(self.mockedQueso, times=1).melt(True)

    def test_quesadillaBuena(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(False)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(20)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        self.assertEquals("Good quesadilla",
                          self.quesadilla.prepareSingle())
        verify(self.mockedTortilla, times=0).toast(True)
        verify(self.mockedQueso, times=1).melt(True)

    def test_quesadillaTerrible(self):
        when(self.mockedQueso).isMelted().thenReturn(False)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(20)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        self.assertEquals("Terrible quesadilla",
                          self.quesadilla.prepareSingle())
        verify(self.mockedTortilla, times=0).toast(True)
        verify(self.mockedQueso, times=1).melt(True)

    def test_noHayGas(self):
        when(self.mockedQueso).isMelted().thenReturn(False)
        when(self.mockedTortilla).isToasted().thenReturn(False)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(20)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        self.assertEquals("You ran out of gas",
                          self.quesadilla.prepareSingle())
        verify(self.mockedTortilla, times=0).toast(True)
        verify(self.mockedQueso, times=1).melt(True)

    def test_quesadillaDoblePerfecta(self):
        when(self.mockedQuesoDoble).isMelted().thenReturn(True)
        when(self.mockedTortilla1).isToasted().thenReturn(True)
        when(self.mockedTortilla2).isToasted().thenReturn(True)
        when(self.mockedTortilla1).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla1).getToastTemperature().thenReturn(10)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(10)
        when(self.mockedQuesoDoble).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedQuesoDoble).getMeltingTemperature().thenReturn(10)
        self.assertEquals("Perfect double quesadilla",
                          self.quesadillaDoble.prepareDouble())
        verify(self.mockedTortilla1, times=1).toast(True)
        verify(self.mockedTortilla2, times=1).toast(True)
        verify(self.mockedQuesoDoble, times=1).melt(True)

    def test_quesadillaDobleBuenaTortilla1(self):
        when(self.mockedQuesoDoble).isMelted().thenReturn(True)
        when(self.mockedTortilla1).isToasted().thenReturn(False)
        when(self.mockedTortilla2).isToasted().thenReturn(True)
        when(self.mockedTortilla1).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla1).getToastTemperature().thenReturn(20)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(10)
        when(self.mockedQuesoDoble).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedQuesoDoble).getMeltingTemperature().thenReturn(10)
        self.assertEquals("Good double quesadilla toasted2",
                          self.quesadillaDoble.prepareDouble())
        verify(self.mockedTortilla1, times=0).toast(True)
        verify(self.mockedTortilla2, times=1).toast(True)
        verify(self.mockedQuesoDoble, times=1).melt(True)

    def test_quesadillaDobleBuenaTortilla2(self):
        when(self.mockedQuesoDoble).isMelted().thenReturn(True)
        when(self.mockedTortilla1).isToasted().thenReturn(True)
        when(self.mockedTortilla2).isToasted().thenReturn(False)
        when(self.mockedTortilla1).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla1).getToastTemperature().thenReturn(10)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(20)
        when(self.mockedQuesoDoble).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedQuesoDoble).getMeltingTemperature().thenReturn(10)
        self.assertEquals("Good double quesadilla toasted1",
                          self.quesadillaDoble.prepareDouble())
        verify(self.mockedTortilla1, times=1).toast(True)
        verify(self.mockedTortilla2, times=0).toast(True)
        verify(self.mockedQuesoDoble, times=1).melt(True)

    def test_quesadillaDobleRegular(self):
        when(self.mockedQuesoDoble).isMelted().thenReturn(True)
        when(self.mockedTortilla1).isToasted().thenReturn(False)
        when(self.mockedTortilla2).isToasted().thenReturn(False)
        when(self.mockedTortilla1).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla1).getToastTemperature().thenReturn(20)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(20)
        when(self.mockedQuesoDoble).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedQuesoDoble).getMeltingTemperature().thenReturn(10)
        self.assertEquals("Regular double quesadilla",
                          self.quesadillaDoble.prepareDouble())
        verify(self.mockedTortilla1, times=0).toast(True)
        verify(self.mockedTortilla2, times=0).toast(True)
        verify(self.mockedQuesoDoble, times=1).melt(True)

    def test_quesadillaDobleMala(self):
        when(self.mockedQuesoDoble).isMelted().thenReturn(False)
        when(self.mockedTortilla1).isToasted().thenReturn(True)
        when(self.mockedTortilla2).isToasted().thenReturn(True)
        when(self.mockedTortilla1).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla1).getToastTemperature().thenReturn(10)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(10)
        when(self.mockedQuesoDoble).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedQuesoDoble).getMeltingTemperature().thenReturn(10)
        self.assertEquals("Bad double quesadilla",
                          self.quesadillaDoble.prepareDouble())
        verify(self.mockedTortilla1, times=1).toast(True)
        verify(self.mockedTortilla2, times=1).toast(True)
        verify(self.mockedQuesoDoble, times=1).melt(True)

    def test_quesadillaDobleTerrible1(self):
        when(self.mockedQuesoDoble).isMelted().thenReturn(False)
        when(self.mockedTortilla1).isToasted().thenReturn(False)
        when(self.mockedTortilla2).isToasted().thenReturn(True)
        when(self.mockedTortilla1).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla1).getToastTemperature().thenReturn(20)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(10)
        when(self.mockedQuesoDoble).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedQuesoDoble).getMeltingTemperature().thenReturn(10)
        self.assertEquals("Terrible double quesadilla toasted2",
                          self.quesadillaDoble.prepareDouble())
        verify(self.mockedTortilla1, times=0).toast(True)
        verify(self.mockedTortilla2, times=1).toast(True)
        verify(self.mockedQuesoDoble, times=1).melt(True)

    def test_quesadillaDobleTerrible2(self):
        when(self.mockedQuesoDoble).isMelted().thenReturn(False)
        when(self.mockedTortilla1).isToasted().thenReturn(True)
        when(self.mockedTortilla2).isToasted().thenReturn(False)
        when(self.mockedTortilla1).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla1).getToastTemperature().thenReturn(10)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(20)
        when(self.mockedQuesoDoble).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedQuesoDoble).getMeltingTemperature().thenReturn(10)
        self.assertEquals("Terrible double quesadilla toasted1",
                          self.quesadillaDoble.prepareDouble())
        verify(self.mockedTortilla1, times=1).toast(True)
        verify(self.mockedTortilla2, times=0).toast(True)
        verify(self.mockedQuesoDoble, times=1).melt(True)

    def test_quesadillaDobleNoSeCocino(self):
        when(self.mockedQuesoDoble).isMelted().thenReturn(False)
        when(self.mockedTortilla1).isToasted().thenReturn(False)
        when(self.mockedTortilla2).isToasted().thenReturn(False)
        when(self.mockedTortilla1).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla1).getToastTemperature().thenReturn(20)
        when(self.mockedTortilla2).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedTortilla2).getToastTemperature().thenReturn(20)
        when(self.mockedQuesoDoble).getCurrentTemperature().thenReturn(
            2, 8, 8, 8, 14)
        when(self.mockedQuesoDoble).getMeltingTemperature().thenReturn(10)
        self.assertEquals("Not cooked double quesadilla",
                          self.quesadillaDoble.prepareDouble())
        verify(self.mockedTortilla1, times=0).toast(True)
        verify(self.mockedTortilla2, times=0).toast(True)
        verify(self.mockedQuesoDoble, times=1).melt(True)
