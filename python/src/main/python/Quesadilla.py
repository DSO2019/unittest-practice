class Quesadilla:
    queso
    tortilla
    heatLevel

    def prepareString():
        while(getQueso().getCurrentTemperature() < getQueso().getMeltingTempresature()
            and getTortilla().getCurrentTemperature()< getTortilla().getToastTemperature()){
            getTortilla().setCurrentTemperature(getTortilla().getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso().getCurrentTemperature() + getHeatLevel()):
            if getTortilla().getCurrentTemperature() >= getTortilla().getToastTemperature():
                getTortilla().toast(True)
            if getQueso().getCurrentTemperature() >= getQueso().getMeltingTempresature():
                getQueso().melt(True)
        
        if getQueso().isMelted() and getTortilla().isToasted():
            return 'Perfect quesadilla'
        if getQueso().isMelted() and not getTortilla().isToasted():
            return 'Good quesadilla'
        if not getQueso().isMelted() and not getTortilla().isToasted():
            return 'Terrible quesadilla'
        else:
            return 'You ran out of gas'

    def prepareDouble():
        return ''

    def getQueso():
        return queso
    
    def setQueso(queso):
        self.queso = queso
    
    def getTortilla():
        return tortilla
    
    def setTortilla(tortilla):
        self.tortilla = tortilla
    
    def getHeatLevel():
        return heatLevel
    
    def setHeatLevel(heatLevel):
        self.heatLevel = heatLevel

