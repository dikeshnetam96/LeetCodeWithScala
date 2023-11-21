package leetcode

import org.scalatest.funsuite.AnyFunSuiteLike

class IsUglyTest extends AnyFunSuiteLike {

  test("test 1") {
    val num = 6
    val res = IsUgly.helper(num)
    assert(res,true)
  }

  test("test 2") {
    val num = 14
    val res = IsUgly.helper(num)
    assert(res, false)
  }


}
