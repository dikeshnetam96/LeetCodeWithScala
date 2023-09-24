package leetcode

import leetcode.ValidatePalindrome.{checkPalindrome}
import org.junit.Assert

object ValidatePalindromeTest extends App {

  val str = "A man, a plan, a canal: Panama"
  val newStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
  val strN = "aman"
  val newStrN = strN.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()


  @org.junit.Test
  def test(): Boolean = {
    val isPalindrome = checkPalindrome(newStr)
    Assert.assertTrue(isPalindrome)
    isPalindrome
  }

  @org.junit.Test
  def test2(): Boolean = {
    val isPalindrome = checkPalindrome(newStrN)
    Assert.assertFalse(isPalindrome)
    isPalindrome
  }

  test()
  test2()


}
