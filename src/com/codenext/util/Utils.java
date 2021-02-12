package com.codenext.util;

import java.util.Random;

public class Utils {

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (i != 0) { //skip the first item, so we won't get , in front of it.
        System.out.print(", ");
      }
      System.out.print(arr[i]);
    }
    System.out.println();
  }

  public static void printArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      printArray(arr[i]);
    }
  }

  public static int sum(int[] arr) {
    int result = 0;
    for (int i = 0; i < arr.length; i++) {
      result += arr[i];
    }
    return result;
  }

  static public void print(String s) {
    System.out.print(s);
  }

  static public void println(String s) {
    System.out.println(s);
  }

  static public void println() {
    System.out.println();
  }

  public static int[] randomArray(int size) {
    //Initialize array with random number
    int[] arr = new int[size];
    Random random = new Random();
    for (int i = 0; i < size; i++) {
      arr[i] = random.nextInt(1000);
    }
    println("Random array:");
    printArray(arr);
    return arr;
  }
}
