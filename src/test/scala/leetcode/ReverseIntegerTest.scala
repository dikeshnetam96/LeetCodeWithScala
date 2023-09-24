package leetcode

import org.scalatest.funsuite.AnyFunSuiteLike

class ReverseIntegerTest extends AnyFunSuiteLike {

  test("For Positive Number") {
    val numP = 134

    val resNumP = ReverseInteger.reverseInteger(numP)
    println(numP+" "+resNumP)
    assert(resNumP==431)
  }

  test("For Negative Number"){
    val numN = -134
    val resNumN = ReverseInteger.reverseInteger(numN)
    assert(resNumN == (-431))
  }

  test("For Out Of Range Number Positive"){
    val outOfRangeP = 1534236479
    val resOutOfRangeP = ReverseInteger.reverseInteger(outOfRangeP)
    assert(resOutOfRangeP.equals(0))
  }

  test("For Out Of Range Number Negative"){
    val outOfRangeN = -1534236499
    val resOutOfRangeN = ReverseInteger.reverseInteger(outOfRangeN)
    assert(resOutOfRangeN.equals(0))
  }
}
