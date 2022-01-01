class Animal(var name: String) {
}

trait Speaker {
  def speak() = {}
}

trait Runner {
  def run() = {}
}

// override base name method
class Dog(override var name: String) extends Animal(name) with Speaker with Runner {}