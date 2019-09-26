class TortillaMaiz:

    def __init__(self):
        self.toasted = None
        self.currentTemperature = None
        self.toastTemperature = 40

    def isToasted(self):
        return self.toasted

    def getToastTemperature(self):
        return self.toastTemperature

    def getCurrentTemperature(self):
        return self.currentTemperature

    def setCurrentTemperature(self, temp):
        self.currentTemperature = temp

    def toast(self, toasted):
        self.toasted = toasted
