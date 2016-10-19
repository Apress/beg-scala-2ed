class Batmobile(speed : Int) extends Vehicle(speed) with flying with gliding{
override val mph: Int = speed
override def race() = println("Racing Batmobile")
override def fly() = println("Flying Batmobile")
override def float() = println("Gliding Batmobile")
}