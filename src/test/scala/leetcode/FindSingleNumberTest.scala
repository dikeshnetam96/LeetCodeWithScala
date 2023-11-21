package leetcode
import org.junit.Assert
object FindSingleNumberTest extends App {

  @org.junit.Test
  def test() : Unit = {
    val myList: Array[Int] = Array(1, 2, 2, 4, 4)
    val expeted = 1
    val actual = FindSingleNumber.findNumber(0,myList.length-1,0,myList)
    Assert.assertEquals(expeted,actual)
  }


  @org.junit.Test
  def test2(): Unit = {
    val myList: Array[Int] = Array(1, 2, 2, 4, 4)
    val expeted = 3
    val actual = FindSingleNumber.findNumber(0, myList.length - 1, 0, myList)
    Assert.assertNotEquals(expeted, actual)
  }

  test()
  test2()
}
