package org.ermain.scala.algorithms.recursion

import scala.annotation.tailrec

object RecursionMain {

  def main(args: Array[String]): Unit = {
    println("Recursion Algorithms in Scala...")

    val sampleArrayList: Array[Int] = Array(95, 88, 91, 92, 99)
    // binarySearch(sampleArrayList, 0, sampleArrayList.length-1, 99)

    val fact5 = Factorial(5)
    println(fact5)
  }

  def binarySearch(array: Array[Int], low: Int, high: Int, searchElement: Int): Unit ={
    if (low < high)
      println("")

    val mid: Int = (low + high) / 2

    if(mid == searchElement){
      println("Element found")
    }else if(mid < searchElement){
      binarySearch(array, mid+1, high, searchElement)
    }else{
      binarySearch(array, low, mid-1, searchElement)
    }
  }

  def binarySeach2(target: Int, list: List[Int]): Option[Int] = {

    @tailrec
    def recursiveSearch(low: Int, high: Int): Option[Int] = (low+high)/2 match{
      case _ if high < low      => None
      case mid if mid < target  => recursiveSearch(mid+1, high)
      case mid if mid > target  => recursiveSearch(low, mid - 1)
    }

    recursiveSearch(0, list.size - 1)
  }

  def Factorial(inputNum: Int): Int = {

    var result: Int = 0

    if (inputNum == 0 | inputNum == 1)
      result = 1
    else
      result = inputNum * Factorial(inputNum - 1)

    result
  }
}
