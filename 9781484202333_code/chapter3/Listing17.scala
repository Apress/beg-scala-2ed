class Car (speed : Int) extends Vehicle(speed) {
override val mph: Int= speed
override def race() = println("Racing Car")
}