import scala.collection.mutable.ArrayBuffer

// самые уебищные определение enum, которые видел в своей жизни
sealed trait DayOfWeek
case object Sunday extends DayOfWeek
case object Monday extends DayOfWeek
case object Tuesday extends DayOfWeek
case object Wednesday extends DayOfWeek
case object Thursday extends DayOfWeek
case object Friday extends DayOfWeek
case object Saturday extends DayOfWeek


sealed trait Topping
case object Cheese extends Topping
case object Pepperoni extends Topping
case object Sausage extends Topping
case object Mushrooms extends Topping
case object Onions extends Topping

sealed trait CrustSize
case object SmallCrustSize extends CrustSize
case object MediumCrustSize extends CrustSize
case object LargeCrustSize extends CrustSize

sealed trait CrustType
case object RegularCrustType extends CrustType
case object ThinCrustType extends CrustType
case object ThickCrustType extends CrustType

class Pizza(var crustSize: CrustSize = MediumCrustSize, var crustType: CrustType = RegularCrustType) {
  var toppings = ArrayBuffer[Topping]()

  def addTopping(t: Topping): Unit = toppings += t
  def remove(t: Topping): Unit = toppings -= t
  def removeAllToppings(t: Topping): Unit = toppings.clear()

  override def toString(): String = {
    s"""
       | $crustSize
       | $crustType
       | $toppings
       |""".stripMargin
  }
}

object PizzaTest extends App {
  val pizza = new Pizza(SmallCrustSize, ThickCrustType)

  pizza.addTopping(Pepperoni)
  pizza.addTopping(Onions)

  println(pizza)
}