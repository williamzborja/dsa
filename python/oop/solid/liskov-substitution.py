# pylint: disable=C0115, C0116, C0103, R0903
"""
Liskov Substitution:
    - Las subclases deben ser sustituibles por sus clases base.
    - Las subclases no deben romper el contrato de sus clases base.
    - Las subclases no deben romper el comportamiento esperado de sus clases base.
"""
from abc import ABC, abstractmethod

class Shape(ABC):
    @abstractmethod
    def calculate_area(self):
        pass

class Rectangle(Shape):
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def calculate_area(self):
        return self.width * self.height

class Square(Shape):
    def __init__(self, side):
        self.side = side

    def calculate_area(self):
        return self.side ** 2

# Cualquier objeto tipo Shape debe tener el metodo calculate_area()
def calculate_area(shape: Shape):
    print(f"Shape: {shape} - Area: {shape.calculate_area()}")

rectangle = Rectangle(1, 2)
square = Square(1)

print(f"Square Area: {calculate_area(square)}")
print(f"Rectangle Area: {calculate_area(rectangle)}")
