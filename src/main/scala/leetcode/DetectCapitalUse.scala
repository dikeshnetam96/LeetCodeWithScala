package leetcode

object DetectCapitalUse extends App {

  /*
  Problem Link - https://leetcode.com/problems/detect-capital/description/

  Problem Description -

  All letters in this word are capitals, like "USA".
  All letters in this word are not capitals, like "leetcode".
  Only the first letter in this word is capital, like "Google".
  Given a string word, return true if the usage of capitals in it is right.
   */

  def checkAllCaps(word : String): Boolean = {
    word.filter(x => (x >= 65 && x <= 90)).equals(word)
  }

  def checkAllSmall(word : String) : Boolean = {
    word.filter(x => (x >= 97 && x <= 122)).equals(word)
  }

  def checkStartCaps(word : String) : Boolean = {
    if(word.charAt(0) >= 65 && word.charAt(0) <= 90){
      checkAllSmall(word.slice(1,word.length))
    }
    else
      false
  }
}
