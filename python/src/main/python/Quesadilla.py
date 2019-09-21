class Quesadilla:

    def __init__(self, queso=None, tortilla=None, tortillas=None, heatLevel=0):
        self.queso = queso
        self.tortilla = tortilla
        self.tortillas = tortillas
        self.heatLevel = heatLevel

    def getQueso(self):
        return self.queso

    def setQueso(self, queso):
        self.queso = queso

    def getTortilla(self):
        return self.tortilla

    def setTortilla(self, tortilla):
        self.tortilla = tortilla

    def getTortillas(self, index):
        return self.tortillas[index]

    def setTortillas(self, tortillas):
        self.tortillas = tortillas

    def getHeatLevel(self):
        return self.heatLevel

    def setHeatLevel(self, heatLevel):
        self.heatLevel = heatLevel

    def prepareSingle(self):
        while(self.getQueso().getCurrentTemperature()
                < self.getQueso().getMeltingTemperature()
                and self.getTortilla().getCurrentTemperature()
                < self.getTortilla().getToastTemperature()):
            self.getTortilla().setCurrentTemperature(
                self.getTortilla().getCurrentTemperature()
                + self.getHeatLevel())
            self.getQueso().setCurrentTemperature(
                self.getQueso().getCurrentTemperature()
                + self.getHeatLevel())

            if (self.getTortilla().getCurrentTemperature()
                    >= self.getTortilla().getToastTemperature()):
                self.getTortilla().toast(True)
            if (self.getQueso().getCurrentTemperature()
                    >= self.getQueso().getMeltingTemperature()):
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
                < self.getQueso().getMeltingTemperature()
                and self.getTortillas(0).getCurrentTemperature()
                < self.getTortillas(0).getToastTemperature()
                and self.getTortillas(1).getCurrentTemperature()
                < self.getTortillas(1).getToastTemperature()):
            self.getTortillas(0).setCurrentTemperature(
                self.getTortillas(0).getCurrentTemperature()
                + self.getHeatLevel())
            self.getTortillas(1).setCurrentTemperature(
                self.getTortillas(1).getCurrentTemperature()
                + self.getHeatLevel())
            self.getQueso().setCurrentTemperature(
                self.getQueso().getCurrentTemperature()
                + self.getHeatLevel())

            if (self.getTortillas(0).getCurrentTemperature()
                    >= self.getTortillas(0).getToastTemperature()):
                self.getTortillas(0).toast(True)
            if (self.getTortillas(1).getCurrentTemperature()
                    >= self.getTortillas(1).getToastTemperature()):
                self.getTortillas(1).toast(True)
            if (self.getQueso().getCurrentTemperature()
                    >= self.getQueso().getMeltingTemperature()):
                self.getQueso().melt(True)

        A = self.getQueso().isMelted()
        B = self.getTortillas(0).isToasted()
        C = self.getTortillas(1).isToasted()
        if(A and B and C):
            return "Quesadilla perfecta"
        if(A and ((B and not C) or (not B and C))):
            return "Quesadilla buena"
        if(not A and B and C):
            return "Quesadilla mala"
        if(not A and ((B and not C) or (not B and C))):
            return "Quesadilla terrible"
        if(not A and not B and not C):
            return "No se cocino"
        if(A and not B and not C):
            return "Quesadilla regular"
        else:
            return "You ran out of gas"
