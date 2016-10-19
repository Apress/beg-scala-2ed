trait Vehicle
private class Car extends Vehicle
private class Bike extends Vehicle
object Vehicle
def apply(type: String) = kind match {
case "car" => new Car()
case "bike" => new Bike()
}
}
Vehicle("car")