package leetcode

import org.scalatest.funsuite.AnyFunSuiteLike
import leetcode.DetectCapitalUse._
class DetectCapitalUseTest extends AnyFunSuiteLike {

  test("test 1") {
    val word = "USA"
    val actualResult = checkAllCaps(word) || checkAllSmall(word) || checkStartCaps(word)
    assert(actualResult)
  }

  test("test 2") {
    val word = "Google"
    val actualResult = checkAllCaps(word) || checkAllSmall(word) || checkStartCaps(word)
    assert(actualResult)
  }

  test("test 3") {
    val word = "leetcode"
    val actualResult = checkAllCaps(word) || checkAllSmall(word) || checkStartCaps(word)
    assert(actualResult)
  }

  test("test 4") {
    val word = "FlaG"
    val actualResult = checkAllCaps(word) || checkAllSmall(word) || checkStartCaps(word)
    assert(!actualResult)
  }

}
