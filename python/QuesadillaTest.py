from Quesadilla import Quesadilla
from QuesoInterface import Queso
from TortillaInterface import Tortilla
from mockito import when, mock, unstub, verify
import unittest

class QuesadillaTest(unittest.TestCase):
	mockedTortilla = mock(Tortilla)
	mockedQueso = mock(Queso)
	quesadilla = Quesadilla()
	quesadilla.setQueso(mockedQueso)
	quesadilla.setTortilla(mockedTortilla)

	def testPerfectQuesadilla(self):
		when(mockedQueso).isMelted().thenReturn(True)
		when(mockedTortilla).isToasted().thenReturn(True)
		when(mockedTortilla).getCurrentTemperature().thenReturn(2,8, 8, 14)
		when(mockedTortilla).getToastTemperature().thenReturn(10)
		when(mockedQueso).getCurrentTemperature().thenReturn(2,8,8,14)
		when(mockedQueso).getMeltingTemperature().thenReturn(10)
		assertEquals('Perfect quesadilla', self.quesadilla.prepareSingle())
      # verify(mockedQueso, times=1).melt(True)


    def testQuesadillaBuena(self):
		print("f")

