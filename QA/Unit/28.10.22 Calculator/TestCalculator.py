import unittest
from Calculator import Calculator


class TestCalculator(unittest.TestCase):
    def setUp(self):
        self.calculator = Calculator()

    def test_add(self):
        self.assertEqual(self.calculator.add(5, 6), 11)

    def test_mult(self):
        self.assertEqual(self.calculator.mult(5, 6), 30)

    def test_sub(self):
        self.assertEqual(self.calculator.sub(15, 6), 11)

    def test_div(self):
        self.assertEqual(self.calculator.div(30, 6), 5)

    def test_pow(self):
        self.assertEqual(self.calculator.pow(10, 5, 3), 3375)


if __name__ == '__main__':
    unittest.main()
