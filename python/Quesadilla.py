import QuesoManchego
import TortillaMaiz

class Quesadilla:

	def __init__(self, queso = None, tortilla = None, heatLevel = None):
		self.queso = queso
		self.tortilla = tortilla
		self.heatLevel = heatLevel


	def getQueso(self):
		return self.queso

	def setQueso(self, queso):
		self.queso = queso

	def getTortilla(self):
		return self.tortilla

	def setTortilla(self, tortilla):
		self.tortilla = tortilla

	def getHeatLevel(self):
		return self.heatLevel

	def setHeatLevel(self, heatLevel):
		self.heatLevel = heatLevel

	def prepareSingle(self):
		while (self.getQueso().getCurrentTemperature() < self.getQueso().getMeltingTemperature() 
		and self.getTortilla().getCurrentTemperature() < self.getTortilla().getToastTemperature()):
			self.getQueso().setCurrentTemperature(self.getQueso().getCurrentTemperature() + self.getHeatLevel())
			if (self.getTortilla().getCurrentTemperature() >= self.getTortilla().getToastTemperature()):
				self.getTortilla().toast(True)

			if(self.getQueso().getCurrentTemperature() >= self.getQueso().getMeltingTemperature()):
				self.getQueso().melt(True)


		if(self.getQueso().isMelted() and self.getTortilla().isToasted()):
			return 'Perfect quesadilla'
		if(self.getQueso().isMelted() and not self.getTortilla().isToasted()):
			return 'Good quesadilla'
		if(not self.getQueso().isMelted() and self.getTortilla().isToasted()):
			return 'Terrible quesadilla'
		if(not self.getQueso().isMelted() and not self.getTortilla().isToasted()):
			return 'You ran out of gas'

