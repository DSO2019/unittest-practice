# Para Tortilla
class TortillaHarina:

    # Constructor de Python
    def __init__(self, toasted=None, temperature=None, toasting=20):
        self.toasted = toasted
        self.temperature = temperature
        self.toasting = toasting

    def is_toasted(self):
        return self.toasted

    def get_current_temperature(self):
        return self.temperature

    def get_toasting_temperature(self):
        return self.toasting

    def set_current_temperature(self, arg):
        self.temperature = arg

    def toast(self, melted):
        self.toasted = melted
