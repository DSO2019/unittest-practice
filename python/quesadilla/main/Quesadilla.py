class Quesadilla:

    # Constructor
    def __init__(self, queso=None, tortilla=None,
                 tortilla2=None, heat_level=0):
        self.queso = queso
        self.tortilla = tortilla
        self.tortilla2 = tortilla2
        self.heat_level = heat_level

    # Getters y setters
    def get_queso(self):
        return self.queso

    def set_queso(self, arg):
        self.queso = arg

    def get_tortilla(self):
        return self.tortilla

    def set_tortilla(self, arg):
        self.tortilla = arg

    def get_tortilla2(self):
        return self.tortilla2

    def set_tortilla2(self, arg):
        self.tortilla2 = arg

    def get_heat_level(self):
        return self.heat_level

    def set_heat_level(self, arg):
        self.heat_level = arg

    # Preparar single
    def prepare_single(self):
        while(self.get_queso().get_current_temperature()
              < self.get_queso().get_melting_temperature()
              and self.get_tortilla().get_current_temperature()
              < self.get_tortilla().get_toasting_temperature()):
            self.get_tortilla().set_current_temperature(
                self.get_tortilla().get_current_temperature()
                + self.get_heat_level())
            self.get_queso().set_current_temperature(
                self.get_queso().get_current_temperature()
                + self.get_heat_level())

            if(self.get_tortilla().get_current_temperature()
               >= self.get_tortilla().get_toasting_temperature()):
                self.get_tortilla().toast(True)
            if(self.get_queso().get_current_temperature()
               >= self.get_queso().get_melting_temperature()):
                self.get_queso().melt(True)

        if(self.get_queso().is_melted()
                and self.get_tortilla().is_toasted()):
            return "Quesadilla perfecta"
        if(self.get_queso().is_melted()
                and not self.get_tortilla().is_toasted()):
            return "Buena quesadilla"
        if(not self.get_queso().is_melted()
                and self.get_tortilla().is_toasted()):
            return "Quesadilla terrible"
        else:
            return "You ran out of gas"

        # Quesadilla doble

    def prepare_double(self):
        while (self.get_queso().get_current_temperature()
               < self.get_queso().get_melting_temperature()
               and self.get_tortilla().get_current_temperature()
               < self.get_tortilla().get_toasting_temperature()
               and self.get_tortilla2().get_current_temperature()
               < self.get_tortilla2().get_toasting_temperature()):

            self.get_tortilla().set_current_temperature(
                self.get_tortilla().get_current_temperature()
                + self.get_heat_level())

            self.get_tortilla2().set_current_temperature(
                self.get_tortilla2().get_current_temperature()
                + self.get_heat_level())

            self.get_queso().set_current_temperature(
                self.get_queso().get_current_temperature()
                + self.get_heat_level())

            if (self.get_tortilla().get_current_temperature()
                    >= self.get_tortilla().get_toasting_temperature()):
                self.get_tortilla().toast(True)

            if (self.get_tortilla2().get_current_temperature()
                    >= self.get_tortilla2().get_toasting_temperature()):
                self.get_tortilla2().toast(True)

            if (self.get_queso().get_current_temperature()
                    >= self.get_queso().get_melting_temperature()):
                self.get_queso().melt(True)

        if (self.get_queso().is_melted()
                and self.get_tortilla().is_toasted()
                and self.get_tortilla2().is_toasted()):
            return "Quesadilla doble perfecta"

        if (self.get_queso().is_melted()
                and not self.get_tortilla().is_toasted()
                and self.get_tortilla2().is_toasted()):
            return "Buena quesadilla doble 1"

        if (self.get_queso().is_melted()
                and self.get_tortilla().is_toasted()
                and not self.get_tortilla2().is_toasted()):
            return "Buena quesadilla doble 2"

        if (self.get_queso().is_melted()
                and not self.get_tortilla().is_toasted()
                and not self.get_tortilla2().is_toasted()):
            return "Quesadilla doble regular"

        if (not self.get_queso().is_melted()
                and self.get_tortilla().is_toasted()
                and self.get_tortilla2().is_toasted()):
            return "Quesadilla doble mala"

        if (not self.get_queso().is_melted()
                and not self.get_tortilla().is_toasted()
                and self.get_tortilla2().is_toasted()):
            return "Quesadilla doble terrible 1"

        if (not self.get_queso().is_melted() and
                self.get_tortilla().is_toasted()
                and not self.get_tortilla2().is_toasted()):
            return "Quesadilla doble terrible 2"
        else:
            return "Quesadilla doble sin gas"
