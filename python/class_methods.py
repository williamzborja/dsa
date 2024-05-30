class MyClass:
    attr = "attribute"

    def __init__(self, value):
        self.value = value

    def instance_method(self):
        return self.value

    @staticmethod
    def static_method():
        return "static method"

    @classmethod
    def class_method(cls):
        return cls.attr

obj = MyClass("value")
print(f"Instance method: {obj.instance_method()}")
print(f"Static method: {obj.static_method()}")
