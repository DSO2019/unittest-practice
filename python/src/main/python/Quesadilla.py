class Quesadilla:
    def __init__(self, queso, tortilla, heatLevel = 0):
        self.queso = queso
        self.tortilla = tortilla
        self.heatLevel = heatLevel
    
    def getQueso():
        return self.queso
    
    def setQueso(queso):
        self.queso = queso

    def getTortilla():
        return self.tortilla
    
    def setTortilla(tortilla):
        self.tortilla = tortilla
    
    def getHeatLevel():
        return self.heatLevel
    
    def setHeatLevel(heatLevel):
        self.heatLevel = heatLevel
    
    def prepareSingle():
        while(self.getQueso().getCurrentTemperature() < self.getQueso().getMeltingTemperature() and self.getTortilla().getCurrentTemperature() < self.getTortilla().getToastTemperature()):
            self.getTortilla().setCurrentTemperature(self.getTortilla().getCurrentTemperature() + self.getHeatLevel())
            self.getQueso().setCurrentTemperature(self.getQueso().getCurrentTemperature() + self.getHeatLevel())
            if (self.getTortilla().getCurrentTemperature() >= self.getTortilla().getToastTemperature()):
                self.getTortilla().toast(true)
            if (self.getQueso().getCurrentTemperature() >= self.getQueso().getMeltingTemperature())
                self.getQueso().melt(true)
        
        if(self.getQueso().isMelted() and self.getTortilla().isToasted())
            return "Perfect quesadilla"
        if(self.getQueso().isMelted() and not self.getTortilla().isToasted())
            return "Good quesadilla"
        if(not self.getQueso().isMelted() and self.getTortilla().isToasted())
            return "Terrible quesadilla"
        else
            return "You ran out of gas"
     
