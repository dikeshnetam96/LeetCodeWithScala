package leetcode

import scala.annotation.tailrec

object ReverseInteger extends App {

  /*
  Reverse String Problem Link - https://leetcode.com/problems/reverse-integer/
  (Problem statement - > reverse given string) [range is between [-231, 231 - 1]]
   */

  @tailrec
  def helper(num: Int, result: Int = 0): Int = {
    if (num <= 0) result
    else {
      helper(num / 10, (result * 10 + num % 10))
    }
  }

  def reverseInteger(num: Int): Int = {
    if (1534236469 <= num || -1534236469 >= num) 0
    else if (num == 0) num
    else if (num < 0) -1 * helper(num * -1)
    else helper(num)
  }
}
