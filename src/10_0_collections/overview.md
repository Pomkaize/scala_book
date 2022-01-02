mutable collection can be changed, immutable always return other collection and dont modify original

scala.collection.immutable - гарантированно неизменяемые
scala.collection.mutable - присутствуют методы для изменения
scala.collection - содержит и те и другие

по дефолту берутся неизменяемые коллекции

```scala worksheet
val immutableSet = Set("val")

import scala.collection.mutable

val mutableSet = mutable.Set("val")
```

![base collections](base_collections.svg "base collections")