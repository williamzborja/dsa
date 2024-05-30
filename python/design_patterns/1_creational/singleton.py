"""
Design Pattern Singleton

    - Crear un objeto en la memoria que permita una sola instancia de una clase
    - Se utiliza para crear una instancia de la clase que se va a utilizar en toda la aplicacion
    + Se debe gestionar de manera concurrente
"""


# class Singleton(object):
#     _instance = None

# # Definición de una metaclase
# class Meta(type):
#     def __new__(cls, name, bases, dct):
#         print(f"Creating class {name}")
#         return super().__new__(cls, name, bases, dct)

# # Usando la metaclase para crear una clase
# class MyClass(metaclass=Meta):
#     pass

# # Instanciando MyClass
# obj = MyClass()

from factory import Factory

# print(f"1: {Factory().static_method()}")
# print(f"2: {Factory.static_method()}")

print(f"3: {Factory().base_method()}")

factory = Factory()
