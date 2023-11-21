package leetcode

object IsUgly extends App {
  def helper(num: Int): Boolean = {
    if (num % 2 == 0) helper(num / 2)
    else if (num % 3 == 0) helper(num / 3)
    else if (num % 5 == 0) helper(num / 5)
    else {
      if (num == 1) true
      else false
    }
  }
}
