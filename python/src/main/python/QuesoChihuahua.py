from Queso import Queso


class QuesoChihuahua(Queso):
    def __init__(self, melted=False, temperature=0, melting=20):
        self.melted = melted
        self.temperature = temperature
        self.melting = melting
