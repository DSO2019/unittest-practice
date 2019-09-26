class Queso:

    # Constructor de Python
    def __init__(self, melted=None, temperature=None, melting_temperature=20):
        self.melted = melted
        self.temperature = temperature
        self.melting_temperature = melting_temperature

    def is_melted(self):
        return self.melted

    def get_current_temperature(self):
        return self.temperature

    def get_melting_temperature(self):
        return self.melting_temperature

    def set_current_temperature(self, arg):
        self.temperature = arg

    def melt(self, arg):
        self.melted = arg
