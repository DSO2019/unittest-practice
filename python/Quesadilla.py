class Quesadilla:

	def __init__(self, queso = None, tortilla = None, heatLevel = None):
		self.queso = queso
		self.tortilla = tortilla
		self.heatLevel = heatLevel


	def getQueso(self):
		return self.queso

	def setQueso(self, queso):
		self.queso = 

	def getTortilla(self):
		return self.tortilla

	def setTortilla(self, tortilla):
		self.tortilla = tortilla

	def getHeatLevel(self):
		return self.heatLevel

	def setHeatLevel(self, heatLevel):
		self.heatLevel = heatLevel

	def prepareSingle(self):
		while getQueso().getCurrentTemperature() < getQueso.getMeltingTemperature() 
		and getTortilla().getCurrentTemperature() < getTortilla().getToastTemperature():
			getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel())
			getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel())
			if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature()):
				getTortilla().toast(True)
			if(getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature()):
				getQueso().melt(True)

			if(getQueso().isMelted() and getTortilla().isToasted()):
				return 'Perfect quesadilla'
			if(getQueso().isMelted() and !getTortilla().isToasted()):
				return 'Good quesadilla'
			if(!getQueso().isMelted() and getTortilla().isToasted()):
				return 'Terrible quesadilla'
			if(!getQueso().isMelted() and !getTortilla().isToasted()): 
				return 'You ran out of gas'

