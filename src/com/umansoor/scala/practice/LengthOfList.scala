package com.umansoor.scala.practice


// Find the number of elements in a list

object LengthOfList {

  // length via plain old recursive
  def lengthByRecursive[A](list: List[A]): Int = 
    list match {
      case Nil => 0
      case _ :: rest => 1 + lengthByRecursive(rest)
    
  }
  
  // length via tail recursive 
  def lengthByTailRecursive[A](length: Int, list: List[A]): Int = 
    list match {
    case Nil => length
    case _ :: rest => lengthByTailRecursive(length+1, rest)
  }
  
  // test it out
  def main(args: Array[String]): Unit = {
    val threeInts = List(1,2,3)
    val fourStrings = List("one", "two", "three", "four")
    println (threeInts + " by Recursive: " + lengthByRecursive(threeInts))
    println (threeInts + " by Tail Recursive: " + lengthByTailRecursive(0, threeInts))
    println (fourStrings + " by Recursive: " + lengthByRecursive(fourStrings))
    println (fourStrings + " by Tail Recursive: " + lengthByTailRecursive(0, fourStrings))
    
  }
}


