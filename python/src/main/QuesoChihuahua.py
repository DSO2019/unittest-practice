class QuesoChihuahua:

    def __init__(self,temperature=None,melted=None):
        self.melting = 20
        self.temperature = temperature
        self.melted = melted

    def isMelted(self):
        return self.melted

    def getCurrentTemperature(self):
        return self.temperature

    def getMeltingTemperature(self):
        return self.melting

    def setCurrentTemperature(self,temp):
        self.temperature = temp

    def melt(self,melted):
        self.melted = melted