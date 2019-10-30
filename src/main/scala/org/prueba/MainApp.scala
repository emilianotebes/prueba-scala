package org.prueba

import java.util.NoSuchElementException

object MainApp extends App {
  //  println("Hola mundo")
  val prueba = new Prueba()

  val ble = Option(null)
  val bla = new Algo(ble)
  println(bla)


  //  println(prueba.saludar("Pepe"))
  //
  //  println(prueba.highOrder("Jose", prueba.saludar))
  //
  //  println(prueba.sumar(5)(8))
  //
  //  println(prueba.pruebaMatch(10))
  //
  //  prueba.printNTimes(11)
  //
  //  println(prueba.repeat(2, List(1, 2, 3)))

  println(prueba.newFilter(10, List(1, 2, 3, 23, 12, 2)))
}

class Algo(ble: Option[BigDecimal])


object Magic {
  def last(aList: List[Any]): Any = {
    aList.last
  }

  def penultimate(aList: List[Any]): Any = {
    aList match {
      case _ :: _ => aList.reverse.tail.head
      case _ => throw new NoSuchElementException("Not enough elements")
    }
  }

  def nth(pos: Int, aList: List[Any]): Any = {

  }
}