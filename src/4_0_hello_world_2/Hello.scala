// App trait has delayedInit trait which saved body
object Hello extends App {
  if (args.length > 0)
    println(args(0))
  println("Hello, world")
}