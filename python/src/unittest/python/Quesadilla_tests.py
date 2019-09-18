from mockito import mock, verify, when
import unittest

from Quesadilla import * 
from Queso import *
from Tortilla import *

class Quesadilla_test(unittest.TestCase):

    
    def setUp(self):
        self.quesadilla = Quesadilla()
        self.mockedQueso = mock(Queso, strict=False)
        self.mockedTortilla = mock(Tortilla, strict=False)
        self.quesadilla.setQueso(self.mockedQueso)
        self.quesadilla.setTortilla(self.mockedTortilla)

    
    
    def test_quesadillaPerfecta(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2,8,8,8,14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2,8,8,8,14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        self.assertEqual("Perfect quesadilla",self.quesadilla.prepareSingle())
        verify(self.mockedTortilla,times=1).toast(True)
        verify(self.mockedQueso,times=1).melt(True)
        
    def test_quesadillaBuena(self):
        when(self.mockedQueso).isMelted().thenReturn(True)
        when(self.mockedTortilla).isToasted().thenReturn(False)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2,8,8,8,14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(20)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2,8,8,8,14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        self.assertEqual("Good quesadilla",self.quesadilla.prepareSingle())
        verify(self.mockedTortilla,times=0).toast(True)
        verify(self.mockedQueso,times=1).melt(True)
    
    def test_quesadillaTerrible(self):
        when(self.mockedQueso).isMelted().thenReturn(False)
        when(self.mockedTortilla).isToasted().thenReturn(True)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2,8,8,8,14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2,8,8,8,14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(20)
        self.assertEqual("Terrible quesadilla",self.quesadilla.prepareSingle())
        verify(self.mockedTortilla,times=1).toast(True)
        verify(self.mockedQueso,times=0).melt(True)

    def test_noHayGas(self):
        when(self.mockedQueso).isMelted().thenReturn(False)
        when(self.mockedTortilla).isToasted().thenReturn(False)
        when(self.mockedTortilla).getCurrentTemperature().thenReturn(2,8,8,8,14)
        when(self.mockedTortilla).getToastTemperature().thenReturn(10)
        when(self.mockedQueso).getCurrentTemperature().thenReturn(2,8,8,8,14)
        when(self.mockedQueso).getMeltingTemperature().thenReturn(10)
        self.assertEqual("You ran out of gas",self.quesadilla.prepareSingle())
        verify(self.mockedTortilla,times=1).toast(True)
        verify(self.mockedQueso,times=1).melt(True)

