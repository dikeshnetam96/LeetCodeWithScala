package leetcode

import scala.annotation.tailrec

object NumberOf1Bits extends App {

  /*
  Reverse String Problem Link - https://leetcode.com/problems/number-of-1-bits/
  (Problem statement - > count the number of set bits of number.
   */
  def isBitSet(num: BigInt): Int = if ((num & ~(num - 1)) == 1) 1 else 0

  @tailrec
  def helper(num: BigInt, bit: Int): Int = {
    if (num <= 0) return bit
    else helper(num >> 1, bit + isBitSet(num))
  }
  def num(num: BigInt): BigInt = helper(num, 0)
}