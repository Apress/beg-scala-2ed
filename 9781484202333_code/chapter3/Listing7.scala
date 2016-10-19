class Two extends One{
override val thing= (new java.util.Date).toString
}
class Three extends One{
override lazy val thing= super.thing + (newjava.util.Date).toString
}