package leetcode

/*
Problem Link - https://leetcode.com/problems/valid-anagram/description/
Description -  Given two strings s and t, return true if t is an anagram of s, and false otherwise.
               An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
               typically using all the original letters exactly once.
 */
object ValidAnagram extends App {
  def isAnagram(s: String, t: String): Boolean = {
    s.sorted == t.sorted
  }
}
