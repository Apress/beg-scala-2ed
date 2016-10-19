class Stuff(val name: String,val age: Int) {
override def toString = "Stuff("+name+","+age+")"
override def hashCode= name.hashCode+ age
override def equals(other: AnyRef)= other match {
case s: Stuff=> this.name== s.name &&this.age == s.age
case _ => false
}
}
object Stuff {
def apply(name: String, age: Int) = new Stuff(name,age)
def unapply(s: Stuff)= Some((s.name, s.age))
}