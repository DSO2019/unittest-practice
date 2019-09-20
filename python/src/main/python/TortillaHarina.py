from Tortilla import Tortilla


class TortillaHarina(Tortilla):
    def __init__(self, toasted=False, temperature=0, toasting=20):
        self.toasted = toasted
        self.temperature = temperature
        self.toasting = toasting
