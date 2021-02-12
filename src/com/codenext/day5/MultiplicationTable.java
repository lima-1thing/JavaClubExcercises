package com.codenext.day5;

import static com.codenext.util.Utils.println;
import static com.codenext.util.Utils.print;

public class MultiplicationTable {

  static public void main(String args[]) {
    //print header
    printHeader();

    for (int i = 1; i < 10; i++) {
      print(String.format("%3s:", i));
      for (int j = 1; j < 10; j++) {
        print(String.format("%3s", i * j));
      }
      println();
    }
  }

  private static void printHeader() {
    print("    ");
    for (int i = 1; i < 10; i++) {
      print(String.format("%3s", i));
    }
    println();
    print("    ");
    for (int i = 1; i < 10; i++) {
      print("---");
    }
    println();
  }
}
