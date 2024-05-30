
""" Implement Factory """
class Factory:

    def base_method(self):
        return "Base method"

    @staticmethod
    def static_method():
        return "Static Method"

    @classmethod
    def class_method(cls):
        return f"Class Method {cls}"
