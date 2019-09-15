from abc import ABC, abstractmethod

class TortillaInterface(ABC):

	@abstractmethod
	def isToasted(self):
		pass

	@abstractmethod
	def getToastTemperature(self):
		pass

	@abstractmethod
	def getCurrentTemperature(self):
		pass

	@abstractmethod
	def setCurrentTemperature(self):
		pass

	@abstractmethod
	def toast(self):
		pass