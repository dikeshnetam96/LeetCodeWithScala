package leetcode

import org.scalatest.funsuite.AnyFunSuiteLike

class ClimbingStairsTest extends AnyFunSuiteLike {

  test("test1") {
    val res = ClimbingStairs.climbStairs(4)
//    println(res)
    assert(res==5)
  }


}
