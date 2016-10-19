trait IgnoresName {
this: KnowsName =>
def ignoreName(when: String): Boolean
def currentName(when: String): Option[String] =
if (ignoreName(when)) None else Some(name)
}