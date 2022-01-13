val DefaultClusterSize = 12
val DefaultCrustType = "THIN"

// primary constructor
class Pizza (var crustSize: Int, var crustType: String) {

  // one arg constructor
  def this(crustSize: Int) = {
    this(crustSize, DefaultCrustType)
  }

  // one arg constructor
  def this(crustType: String) = {
    this(DefaultClusterSize, crustType)
  }

  // without args constructors
  def this() = {
    this(DefaultClusterSize, DefaultCrustType)
  }
}

new Pizza(DefaultClusterSize, DefaultCrustType)
new Pizza(DefaultClusterSize)
new Pizza(DefaultCrustType)
new Pizza()