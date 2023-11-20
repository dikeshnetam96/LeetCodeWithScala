package leetcode

import org.scalatest.funsuite.AnyFunSuiteLike

class IsHappyTest extends AnyFunSuiteLike {

  test("test1") {
    val res = IsHappy.isHappy(19)
    assert(res,true)
  }
}
