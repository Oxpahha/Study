class Calculator:
    def __init__(self):
        pass

    def add(self, x1, x2):
        return x1+x2

    def mult(self, x1, x2):
        return x1*x2

    def sub(self, x1, x2):
        return x1-x2

    def div(self, x1, x2):
        if x2 != 0:
            return x1/x2

    def pow(self, x1, x2, x3):
        return (x1+x2)**x3