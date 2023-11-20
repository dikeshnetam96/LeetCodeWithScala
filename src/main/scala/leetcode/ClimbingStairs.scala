package leetcode

object ClimbingStairs extends App {

  def climbStairs(n: Int): Int = {
    def helper(n: Int): Int = {
      if (n < 0) 0
      else if (n == 0)
        1
      else
        helper(n - 1) + helper(n - 2)
    }

    helper(n)
  }
}
