class Vehicle (speed : Int){
val mph :Int = speed
def race() = println("Racing")
}
class Car (speed : Int) extends Vehicle(speed) {
override val mph: Int= speed
override def race() = println("Racing Car")
}
class Bike(speed : Int) extends Vehicle(speed) {
override val mph: Int = speed
override def race() = println("Racing Bike")
}