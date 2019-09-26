class Tortilla(object):

    # Constructor de Python
    def __init__(self, toasted=None,
                 temperature=None, toasting_temperature=20):
        self.toasted = toasted
        self.temperature = temperature
        self.toasting_temperature = toasting_temperature

    def is_toasted(self):
        return self.toasted

    def get_current_temperature(self):
        return self.temperature

    def get_toasting_temperature(self):
        return self.toasting_temperature

    def set_current_temperature(self, arg):
        self.temperature = arg

    def toast(self, arg):
        self.toasted = arg
