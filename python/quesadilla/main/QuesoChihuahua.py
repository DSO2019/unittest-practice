# Para Queso
class QuesoChihuahua:

    # Constructor de Python
    def __init__(self, melted=None, temperature=None, melting=20):
        self.melted = melted
        self.temperature = temperature
        self.melting = melting

    def is_melted(self):
        return self.melted

    def get_current_temperature(self):
        return self.temperature

    def get_melting_temperature(self):
        return self.melting

    def set_current_temperature(self, arg):
        self.temperature = arg

    def melt(self, melted):
        self.melted = melted
