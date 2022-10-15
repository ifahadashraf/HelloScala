package com.helloscala

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    var a = 1;
    def func(): Int = {
      return 1;
    }
    print(func())
  }
}