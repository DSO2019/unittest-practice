from mockito import mock, verify, when
import unittest

from Quesadilla import * 

class Quesadilla_test(unittest.TestCase):

    
    def setUp(self):
        self.quesadilla = Quesadilla()
        self.mockedQueso = mock()
        self.mockedTortilla = mock()
        self.quesadilla.setQueso(self.mockedQueso)
        self.quesadilla.setTortilla(self.mockedTortilla)

    
    
    def test_quesadillaPerfecta(self):
        when(self.mockedQueso.isMelted()).thenReturn(True)
        when(self.mockedTortilla.isToasted()).thenReturn(True)
        when(self.mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14)
        when(self.mockedTortilla.getToastTemperature()).thenReturn(10)
        when(self.mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14)
        when(self.mockedQueso.getMeltingTemperature()).thenReturn(10)
        self.assertEqual("Perfect quesadilla",self.quesadilla.prepareSingle())
        verify(self.mockedTortilla,times=1).toast(True)
        verify(self.mockedQueso,times=1).melt(True)
        

    
    # def test_quesadillaBuena(self):
    #     when(mockedQueso.isMelted()).thenReturn(true)
    #     when(mockedTortilla.isToasted()).thenReturn(true)
    #     when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14)
    #     when(mockedTortilla.getToastTemperature()).thenReturn(10)
    #     when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14)
    #     when(mockedQueso.getMeltingTemperature()).thenReturn(10)
    #     self.assertEquals("Perfect quesadilla",quesadilla.prepareSingle())
    #     verify(mockedTortilla,times(1)).toast(true)
    #     verify(mockedQueso,times(1)).melt(true)
    
    # def test_quesadillaPerfecta(self):
    #     when(mockedQueso.isMelted()).thenReturn(true)
    #     when(mockedTortilla.isToasted()).thenReturn(true)
    #     when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14)
    #     when(mockedTortilla.getToastTemperature()).thenReturn(10)
    #     when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14)
    #     when(mockedQueso.getMeltingTemperature()).thenReturn(10)
    #     self.assertEquals("Perfect quesadilla",quesadilla.prepareSingle())
    #     verify(mockedTortilla,times(1)).toast(true)
    #     verify(mockedQueso,times(1)).melt(true)
    
    # def test_quesadillaPerfecta(self):
    #     when(mockedQueso.isMelted()).thenReturn(true)
    #     when(mockedTortilla.isToasted()).thenReturn(true)
    #     when(mockedTortilla.getCurrentTemperature()).thenReturn(2,8,8,8,14)
    #     when(mockedTortilla.getToastTemperature()).thenReturn(10)
    #     when(mockedQueso.getCurrentTemperature()).thenReturn(2,8,8,8,14)
    #     when(mockedQueso.getMeltingTemperature()).thenReturn(10)
    #     self.assertEquals("Perfect quesadilla",quesadilla.prepareSingle())
    #     verify(mockedTortilla,times(1)).toast(true)
    #     verify(mockedQueso,times(1)).melt(true)

