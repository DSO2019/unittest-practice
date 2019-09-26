import QuesoManchego
import TortillaMaiz


class Quesadilla:

    def __init__(self, queso=None, tortilla=None,
                 tortilla2=None, heatLevel=None):
        self.queso = queso
        self.tortilla = tortilla
        self.tortilla2 = tortilla2
        self.heatLevel = heatLevel

    def getQueso(self):
        return self.queso

    def setQueso(self, queso):
        self.queso = queso

    def getTortilla(self):
        return self.tortilla

    def setTortilla(self, tortilla):
        self.tortilla = tortilla

    def getTortilla2(self):
        return self.tortilla2

    def setTortilla2(self, tortilla):
        self.tortilla2 = tortilla

    def getHeatLevel(self):
        return self.heatLevel

    def setHeatLevel(self, heatLevel):
        self.heatLevel = heatLevel

    def prepareSingle(self):
        while (self.getQueso().getCurrentTemperature() <
               self.getQueso().getMeltingTemperature() and
               self.getTortilla().getCurrentTemperature() <
               self.getTortilla().getToastTemperature()):
            self.getQueso().setCurrentTemperature(
                self.getQueso().getCurrentTemperature() + self.getHeatLevel())
            if(self.getTortilla().getCurrentTemperature() >=
               self.getTortilla().getToastTemperature()):
                self.getTortilla().toast(True)

            if(self.getQueso().getCurrentTemperature() >=
               self.getQueso().getMeltingTemperature()):
                self.getQueso().melt(True)

        if(self.getQueso().isMelted() and self.getTortilla().isToasted()):
            return 'Perfect quesadilla'
        if(self.getQueso().isMelted() and not self.getTortilla().isToasted()):
            return 'Good quesadilla'
        if(not self.getQueso().isMelted() and self.getTortilla().isToasted()):
            return 'Terrible quesadilla'
        if(not self.getQueso().isMelted() and
           not self.getTortilla().isToasted()):
            return 'You ran out of gas'

    def prepareDouble(self):
        while (self.getQueso().getCurrentTemperature() <
               self.getQueso().getMeltingTemperature() and
               self.getTortilla().getCurrentTemperature() <
               self.getTortilla().getToastTemperature()):
            self.getQueso().setCurrentTemperature(
                self.getQueso().getCurrentTemperature() + self.getHeatLevel())

            if(self.getTortilla().getCurrentTemperature() >=
               self.getTortilla().getToastTemperature()):
                self.getTortilla().toast(True)

            if(self.getQueso().getCurrentTemperature() >=
               self.getQueso().getMeltingTemperature()):
                self.getQueso().melt(True)

        while (self.getQueso().getCurrentTemperature() <
               self.getQueso().getMeltingTemperature() and
               self.getTortilla2().getCurrentTemperature() <
               self.getTortilla2().getToastTemperature()):
            self.getQueso().setCurrentTemperature(
                self.getQueso().getCurrentTemperature() + self.getHeatLevel())

            if(self.getTortilla2().getCurrentTemperature() >=
               self.getTortilla2().getToastTemperature()):
                self.getTortilla2().toast(True)
            if(self.getQueso().getCurrentTemperature() >=
               self.getQueso().getMeltingTemperature()):
                self.getQueso().melt(True)

        if(self.getTortilla().isToasted() and
           self.getTortilla2().isToasted() and
           self.getQueso().isMelted()):
            return 'Perfect quesadilla'

        if (((not self.getTortilla().getCurrentTemperature()) and
             self.getTortilla2().getCurrentTemperature()) or
           (self.getTortilla().getCurrentTemperature() and
            not (self.getTortilla2().getCurrentTemperature())) and
           self.getQueso().isMelted()):
            return 'Good quesadilla'

        if(self.getTortilla().isToasted() and
           self.getTortilla2().isToasted() and
           not (self.getQueso().isMelted())):
            return 'Bad quesadilla'

        if(not (self.getTortilla().isToasted()) and
           not (self.getTortilla2().isToasted()) and
           not (self.getQueso().isMelted())):
            return 'You ran out of gas'

        if(((self.getTortilla2().isToasted() and
             not self.getTortilla().isToasted()) or
            (self.getTortilla().isToasted() and
             not self.getTortilla2().isToasted())) and
           not self.getQueso().isMelted()):
            return 'Terrible quesadilla'
