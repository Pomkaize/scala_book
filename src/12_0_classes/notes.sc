// var declaration mutable, val declaration immutable
class Person(var firstName: String, val lastName: String) {
  def isRunning(): Boolean = {
    return false
  }
}

val p = new Person("ivan", "ivanov")

// error
//p.lastName = "test"

// in scala class constructor is a combination of
// constructor parameters,
// methods tha are called in the body of the class,
// statements and expressions that are executed in the body


class PersonV2(var firstName: String, var lastName: String) {
  println("the constructor begins")

  // public access to variable by default
  var age = 0

  // private variables
  private val HOME = "HOME"

  override def toString: String = s"$firstName $lastName is $age years old"

  def printHome(): Unit = println(s"HOME = $HOME")
  def printFullName(): Unit = println(this)

  printHome()
  printFullName()
  println("end of constructor")
}

val pv2 = new PersonV2("ivan", "ivanov")

pv2.age = 10

pv2.toString()

pv2.printHome()
pv2.printFullName()

