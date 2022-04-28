class Car:
    'Car class'
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
         print(self.manufacturer + " " + self.model + " has started moving")

    def stop(self):
         print(self.manufacturer + " " + self.model + " has stopped moving")

car1 = Car("Mahindra", "SUV500", "2019", "Manual", "Black")
car2 = Car("Maruti", "Alto K10", "2018", "Manual", "Red")
car3 = Car("Suzuki", "Swift", "2017", "Automatic", "White")

car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()

car3.accelerate()
car3.stop()