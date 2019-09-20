class TortillaMaiz:
    def __init__(self, toasted=False, temperature=0, toasting=20):
        self.toasted = toasted
        self.temperature = temperature
        self.toasting = toasting

    def isToasted(self):
        return self.toasted

    def getCurrentTemperature(self):
        return self.temperature

    def getToastTemperature(self):
        return self.toasting

    def setCurrentTemperature(self, temp):
        self.temperature = temp

    def toast(self, toasted):
        self.toasted = toasted
