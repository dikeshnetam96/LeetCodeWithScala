package leetcode

import scala.annotation.tailrec
/*
  Problem Link - https://leetcode.com/problems/happy-number/description/

  Description - A happy number is a number defined by the following process:

  Starting with any positive integer, replace the number by the sum of the squares of its digits.
  Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
  Those numbers for which this process ends in 1 are happy.
 */
object IsHappy extends App {

  // Below code will compute the sum of all digits after squaring each number
  @tailrec
  def sumAllNumbers(n : Int, ans : Int) : Int = {
    if(n==0)
      ans
    else{
      sumAllNumbers(n/10,(ans+ Math.pow((n%10),2).toInt))
    }
  }
  @tailrec
  def isHappy(n : Int) : Boolean = {
    // if(n==7) true else  // use when you use it in leetcode
    if(n<10){
      n==1
    }
    else {
      isHappy(sumAllNumbers(n,0))
    }
  }
}
