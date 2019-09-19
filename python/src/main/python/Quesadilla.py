class Quesadilla:
    def __init__(self,queso = None,tortilla = None,tortilla1 = None,tortilla2 = None,heatLevel = 0):
        self.queso = queso
        self.tortilla = tortilla
        self.heatLevel = heatLevel
        self.tortilla1 = tortilla1
        self.tortilla2 = tortilla2

    def getQueso(self):
        return self.queso

    def setQueso(self,queso):
        self.queso = queso
    
    def getTortilla(self):
        return self.tortilla
        
    def getTortilla1(self):
        return self.tortilla1

    def getTortilla2(self):
        return self.tortilla2

    def setTortilla(self,tortilla):
        self.tortilla = tortilla

    
    def setTortillas(self,tortillaArriba,tortillaAbajo):
        self.tortilla1 = tortillaArriba
        self.tortilla2 = tortillaAbajo

    def getHeatLevel(self):
        return self.heatLevel

    def setHeatLevel(self,heatLevel):
        self.heatLevel = heatLevel

    def prepareSingle(self):
        while(self.getQueso().getCurrentTemperature() < self.getQueso().getMeltingTemperature() and self.getTortilla().getCurrentTemperature() < self.getTortilla().getToastTemperature()):
            self.getTortilla().setCurrentTemperature(self.getTortilla().getCurrentTemperature() + self.getHeatLevel())
            self.getQueso().setCurrentTemperature(self.getQueso().getCurrentTemperature() + self.getHeatLevel())
            if (self.getTortilla().getCurrentTemperature() >= self.getTortilla().getToastTemperature()):
                self.getTortilla().toast(True)
            if (self.getQueso().getCurrentTemperature() >= self.getQueso().getMeltingTemperature()):
                self.getQueso().melt(True)
    
        if(self.getQueso().isMelted() and self.getTortilla().isToasted()):
            return "Perfect quesadilla"
        if(self.getQueso().isMelted() and not self.getTortilla().isToasted()):
            return "Good quesadilla"
        if(not self.getQueso().isMelted() and self.getTortilla().isToasted()):
            return "Terrible quesadilla"
        else:
            return "You ran out of gas"
    
    def prepareDouble(self):
        while(self.getQueso().getCurrentTemperature() 
            <
            self.getQueso().getMeltingTemperature()
            and
            self.getTortilla1().getCurrentTemperature() 
            <
            self.getTortilla1().getToastTemperature()
            and
            self.getTortilla2().getCurrentTemperature() 
            <
            self.getTortilla2().getToastTemperature()):

            self.getTortilla1().setCurrentTemperature(
                self.getTortilla1().getCurrentTemperature()
                +
                self.getHeatLevel())

            self.getTortilla2().setCurrentTemperature(
                self.getTortilla2().getCurrentTemperature()
                +
                self.getHeatLevel())

            self.getQueso().setCurrentTemperature(
                self.getQueso().getCurrentTemperature()
                +
                self.getHeatLevel())

            if (self.getTortilla1().getCurrentTemperature()
                >=
                self.getTortilla1().getToastTemperature()):
                self.getTortilla1().toast(True)

            if (self.getTortilla2().getCurrentTemperature()
                >=
                self.getTortilla2().getToastTemperature()):
                self.getTortilla2().toast(True)

            if (self.getQueso().getCurrentTemperature()
                >=
                self.getQueso().getMeltingTemperature()):
                self.getQueso().melt(True)
    
        if(self.getQueso().isMelted() and self.getTortilla1().isToasted()
            and self.getTortilla2().isToasted()):
            return "Perfect double quesadilla"
        
        if(self.getQueso().isMelted() and not self.getTortilla1().isToasted()
            and self.getTortilla2().isToasted()):
            return "Good double quesadilla toasted2"
        
        if(self.getQueso().isMelted() and self.getTortilla1().isToasted()
            and not self.getTortilla2().isToasted()):
            return "Good double quesadilla toasted1"

        if(self.getQueso().isMelted() and not self.getTortilla1().isToasted()
            and not self.getTortilla2().isToasted()):
            return "Regular double quesadilla"
        
        
        if(not self.getQueso().isMelted() and self.getTortilla1().isToasted()
            and self.getTortilla2().isToasted()):
            return "Bad double quesadilla"

        if(not self.getQueso().isMelted() and not self.getTortilla1().isToasted()
            and self.getTortilla2().isToasted()):
            return "Terrible double quesadilla toasted2"

        if(not self.getQueso().isMelted() and self.getTortilla1().isToasted()
            and not self.getTortilla2().isToasted()):
            return "Terrible double quesadilla toasted1"
        else:
            return "Not cooked double quesadilla"

