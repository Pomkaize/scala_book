// практически все методы коллекций построены с помощью метода iterable() у trait Iterable

// addition
val set = Set(1)

set.concat(Set(2))

// Map operations
val list = List(1,2,3)

list.map(i => i * 2)

list.collect({ case i if i < 2 => i })

// Conversions toMap toVector...
list.toVector

// Copying operations
list.copyToArray(Array(), 0, 10)

// Size info
list.isEmpty

// Element retrieval
list.head
list.last

// Sub-collection retrieval operations
list.tail

list.take(3)

// Subdivision operations
list.splitAt(4)

// elements tests
list.contains(1)

// folds reduceRight, fold
// Specific folds

list.sum

// String

list.mkString(",")

// view with lazy executing

// другой способ вызова методов коллекций
list foreach (x => x * 3)