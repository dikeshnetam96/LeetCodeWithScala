package leetcode

object licenseKeyFormatting extends App {

  def licenseMaker(s : String, n : Int,start : Int, end : Int, acc : String) : String = {
    if(end>s.length)
      acc.substring(0,acc.length-1)
    else
      licenseMaker(s,n,start+n,end+n,acc+s.substring(start,end) + "-")
  }
  def helper(s : String, k : Int) : String = {
    val newS = s.replace("-", "").toUpperCase()
    if (newS == "") {
      ""
    }
    else {
      val startDigit: Int = newS.length % k
      if (startDigit == 0)
        licenseMaker(newS, k, 0, k, "")
      else
        licenseMaker(newS, k, startDigit, startDigit + k, (newS.substring(0, startDigit)) + "-")
    }
  }
}
