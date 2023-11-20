package leetcode

import org.scalatest.funsuite.AnyFunSuiteLike

class ValidAnagramTest extends AnyFunSuiteLike {
  test("test 1") {
    val res = ValidAnagram.isAnagram("anagram", "nagaram")
    assert(res, true)
  }
}
