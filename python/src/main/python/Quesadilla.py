class Quesadilla:
    def __init__(queso,tortilla,heatLevel):
        queso = queso
        self.tortilla = tortilla
        self.heatLevel = heatLevel
    
    def prepareSingle():
        while(getQueso().getCurrentTemperature() < getQueso().getMeltingTemperature() and getTortilla().getCurrentTemperature()< getTortilla().getToastTemperature()):
            getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel())
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel())
            if (getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature()):
                getTortilla().toast(True)
            if (getQueso().getCurrentTemperature() >= getQueso().getMeltingTemperature()):
                getQueso().melt(True)
    
        if(getQueso().isMelted() and getTortilla().isToasted()):
            return "Perfect quesadilla"
        if(getQueso().isMelted() and not getTortilla().isToasted()):
            return "Good quesadilla"
        if(not getQueso().isMelted() and getTortilla().isToasted()):
            return "Terrible quesadilla"
        else:
            return "You ran out of gas"

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

