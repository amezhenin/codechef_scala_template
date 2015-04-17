/**
 * Problem: http://www.codechef.com/problems/HS08TEST
 *
 * Helpers:
 * ========
 *
 * readInt()
 * readLine()
 * readLine().toList
 * readLine().split(" ")  .split("\\s+")
 * println("%.2f\n".format(res))
 * .toInt
 * .toDouble
 * .toFloat
 * var Array(x1,x2) = readLine().split(" ").map(_.toDouble)
 * */

object Main {

  /**
   * Checkout https://github.com/amezhenin/codechef_scala_template to test your solutions with sbt-doctest
   * {{{
   * >>> Main.alg(30, 120.00)
   * 89.5
   *
   * >>> Main.alg(42, 120.00)
   * 120.0
   *
   * >>> Main.alg(300, 120.00)
   * 120.0
   *
   * }}}
   * */
  def alg(amount: Int, balance: Double):Double = {
    if(amount % 5 != 0 || amount + .5 > balance) balance
    else balance - amount - .5
  }


  def main(args : Array[String]) = {
    val a = readLine().split(" ")
    val res = alg(a(0).toInt, a(1).toDouble)
    println("%.2f\n".format(res))
  }
}
