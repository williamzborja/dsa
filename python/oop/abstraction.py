# pylint: disable=C0115, C0116
"""
Abstraccion:
    - Clase abstracta que representa un objeto.
    - Tiene como propiedad el nombre de la clase y los atributos.
    - Todos los metodos son abstractos.
    - Todo objeto debe heredar de esta clase.
    - Esta clase no se puede instanciar.

Interfaz: Contrato de la clase en el que especifica la abstracción.

    - Es una clase que solo tiene metodos abstractos.
    - Todos los metodos son abstractos.

Clase Abstracta: Molde principal para las otras clases
    - No se puede instanciar.
"""
from abc import ABC, abstractmethod
class MyClass(): # Clase abstracta

    def add(self, a, b):
        return a + b

class Figura(ABC):

    @abstractmethod
    def calcular_area(self):
        pass

    @abstractmethod
    def calcular_perimetro(self):
        pass

# fig = Figura() # No se puede instanciar

class Rectangulo(Figura):
    """ Doc """
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return self.base * self.altura

    def calcular_perimetro(self):
        return 2 * (self.base + self.altura)

class Circulo(Figura):
    """ Doc """
    def __init__(self, radio):
        self.radio = radio

    def calcular_area(self):
        return 3.14159 * self.radio ** 2

    def calcular_perimetro(self):
        return 2 * 3.14159 * self.radio

rectangulo = Rectangulo(5, 3)
circulo = Circulo(2)

print("Rectangulo: ", rectangulo.calcular_area())  # Salida: 15
print("Circulo: ", circulo.calcular_area())  # Salida: 12.56636
