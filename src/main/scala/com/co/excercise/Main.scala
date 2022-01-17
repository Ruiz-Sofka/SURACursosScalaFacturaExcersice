package com.co.excercise

object Main {

  def main(args: Array[String]): Unit = {
    val ipoconsumo = 16

    val price = calculatePrice(10,10)
    val iva = calculateIva(19, price)
    println("Bruto " + (price + iva))
    println("Iva " + iva)
  }

  def calculatePrice(cantidad : Int, valor : Float)={
    cantidad * valor
  }

  def calculateIva(iva : Float, price : Float) = {
    val ivaPercentage = iva/100
    price * ivaPercentage
  }
}