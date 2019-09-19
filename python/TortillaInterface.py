from abc import abstractmethod

class Tortilla:

	def __init__(self):
		pass
	#@abstractmethod
	def isToasted(self):
		pass

	#@abstractmethod
	def getToastTemperature(self):
		pass

	#@abstractmethod
	def getCurrentTemperature(self):
		pass

	#@abstractmethod
	def setCurrentTemperature(self):
		pass

#	@abstractmethod
	def toast(self, toast):
		pass