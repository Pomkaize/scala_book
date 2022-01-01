// basic collections
// List, ListBuffer, Vector, ArrayBuffer, Map, Set
val list = List("one", "two", "three")

// populating lists
val nums = (1 to 10).toList
val letters = ('a' to 'f').toList

// sequence methods
nums.filter(_ < 4).foreach(_ => println(_))