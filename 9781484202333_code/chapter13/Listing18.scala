def validByAge(in: List[Person]): List[String] = {
val valid:ListBuffer[Person] = new ListBuffer // displacedmutability
for(p<- in){
if (p.valid) valid += p
}
def localSortFunction(a: Person,b:Person) = a.age < b.age
val people = valid.toList.sort(localSortFunction _)
val ret:ListBuffer[String] = new ListBuffer
for(p<- people){
ret += p.first
}
ret.toList
}