class Person(var firstName: String, var lastName: String) {
  def getFullName() = println(s"$firstName $lastName")
}

val person = new Person("ivan", "ivanov")

println(person.firstName)
println(person.getFullName())