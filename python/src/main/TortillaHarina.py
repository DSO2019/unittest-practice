class TortillaHarina:
    def __init__(self, toasted=None, temperature=None):
        self.toasting = 10
        self.toasted = toasted
        self.temperature = temperature

    def isToasted(self):
        return self.toasted

    def getToastTemperature(self):
        return self.toasting

    def getCurrentTemperature(self):
        return self.temperature

    def setCurrentTemperature(self, temp):
        self.temperature = temp

    def toast(self, toasted):
        self.toasted = toasted
