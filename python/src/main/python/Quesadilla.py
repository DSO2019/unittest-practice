class Quesadilla:
    def __init__(queso, tortilla, tortilla2, heatLevel):
        self.queso = queso
        self.tortilla = tortilla
        self.tortilla2 = tortilla2
        self.heatLevel = heatLevel

    def prepareSingle():
        while(getQueso().getCurrentTemperature()
              < getQueso().getMeltingTemperature()
              and getTortilla().getCurrentTemperature()
              < getTortilla().getToastTemperature()):

            getTortilla().setCurrentTemperature(
                getTortilla().getCurrentTemperature() + getHeatLevel())

            getQueso().setCurrentTemperature(
                getQueso().getCurrentTemperature() + getHeatLevel())

            if (getTortilla().getCurrentTemperature()
                    >= getTortilla().getToastTemperature()):
                getTortilla().toast(True)

            if (getQueso().getCurrentTemperature()
                    >= getQueso().getMeltingTemperature()):
                getQueso().melt(True)

        if(getQueso().isMelted() and getTortilla().isToasted()):
            return "Perfect quesadilla"
        if(getQueso().isMelted() and not getTortilla().isToasted()):
            return "Good quesadilla"
        if(not getQueso().isMelted() and getTortilla().isToasted()):
            return "Terrible quesadilla"
        else:
            return "You ran out of gas"

    def prepareDouble():
        while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
                and getTortilla().getCurrentTemperature()
                < getTortilla().getToastTemperature()
                and getTortilla2().getCurrentTemperature()
                < getTortilla2().getToastTemperature()):
            getTortilla().setCurrentTemperature(
                getTortilla().getCurrentTemperature() + getHeatLevel()
            )
            getTortilla2().setCurrentTemperature(
                getTortilla2().getCurrentTemperature() + getHeatLevel()
            )
            getQueso().setCurrentTemperature(
                getQueso().getCurrentTemperature() + getHeatLevel()
            )
            if (getTortilla().getCurrentTemperature()
                    >= getTortilla().getToastTemperature()):
                getTortilla().toast(True)

            if (getTortilla2().getCurrentTemperature()
                    >= getTortilla2().getToastTemperature()):
                getTortilla2().toast(True)

            if (getQueso().getCurrentTemperature()
                    >= getQueso().getMeltingTemperature()):
                getQueso().melt(True)

        if (getQueso().isMelted() and getTortilla().isToasted()
                and getTortilla2().isToasted()):
            return "Perfect quesadilla"
        elif ((getQueso().isMelted() and not getTortilla().isToasted()
               and getTortilla2().isToasted())
              or (getQueso().isMelted() and getTortilla().isToasted()
                  and not getTortilla2().isToasted())):
            return "Good quesadilla"
        elif (not getQueso().isMelted() and getTortilla().isToasted()
              and getTortilla2().isToasted()):
            return "Bad quesadilla"
        elif (getQueso().isMelted() and not getTortilla().isToasted()
              and not getTortilla2().isToasted()):
            return "Regular quesadilla"
        elif ((not getQueso().isMelted() and getTortilla().isToasted()
               and getTortilla2().isToasted())
              or (not getQueso().isMelted() and getTortilla().isToasted()
                  and not getTortilla2().isToasted())):
            return "Terrible quesadilla"
        else:
            return "You ran out of gas"

    def getQueso():
        return self.queso

    def setQueso(queso):
        self.queso = queso

    def getTortilla():
        return self.tortilla

    def getTortilla2(self):
        return self.tortilla2

    def setTortilla(tortilla):
        self.tortilla = tortilla

    def setTortilla2(tortila2):
        self.tortilla2 = tortilla2

    def getHeatLevel():
        return self.heatLevel

    def setHeatLevel(heatLevel):
        self.heatLevel = heatLevel
