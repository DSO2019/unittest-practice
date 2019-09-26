class QuesoChihuahua:

    def __init__(self):
        self.melted = None
        self.meltingTemperature = 20
        self.currentTemperature = None

    def isMelted(self):
        return self.melted

    def getCurrentTemperature(self):
        return self.currentTemperature

    def getMeltingTemperature(self):
        return self.meltingTemperature

    def setCurrentTemperature(self, temp):
        self.currentTemperature = temp

    def melt(self, melted):
        self.melted = melted
