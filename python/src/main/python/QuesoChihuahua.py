class QuesoChihuahua:
    def __init__(self,melted = False, temperature = 0, melting = 20):
        self.melted = melted
        self.temperature = temperature
        self.melting = melting
    
    def isMelted():
        return self.melted
    
    def getCurrentTemperature():
        return self.temperature
    
    def getMeltingTemperature():
        return self.melting
    
    def setCurrentTemperature(temp):
        self.temperature = temp

    def melt(melted):
        self.melted = melted
        