package leetcode

import org.scalatest.funsuite.AnyFunSuiteLike

class licenseKeyFormattingTest extends AnyFunSuiteLike {

  test("test 1") {
    val s = "---" //"5F3Z-2eew-9-w"
    val k = 3
    val expResult = ""
    val res = licenseKeyFormatting.helper(s,k)
    assert(res==expResult)
  }

  test("test 2"){
    val s = "5F3Z-2e-9-w" //"5F3Z-2eew-9-w"
    val k = 4
    val expResult = "5F3Z-2E9W"
    val res = licenseKeyFormatting.helper(s, k)
    assert(res == expResult)
  }

  test("test 3") {
    val s = "2-5g-3-J" //"5F3Z-2eew-9-w"
    val k = 2
    val expResult = "2-5G-3J"
    val res = licenseKeyFormatting.helper(s, k)
    assert(res == expResult)
  }

}
