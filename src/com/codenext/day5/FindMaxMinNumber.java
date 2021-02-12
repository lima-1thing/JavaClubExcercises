package com.codenext.day5;

import static com.codenext.util.Utils.print;
import static com.codenext.util.Utils.printArray;
import static com.codenext.util.Utils.println;

import java.util.Random;
import java.util.Scanner;

public class FindMaxMinNumber {

  public static void main(String args[]) {
    print("Please enter array size:");
    int size = new Scanner(System.in).nextInt();
    if (size <= 0) {
      println("Array size must be larger than 0!");
      return;
    }

    //Initialize array with random number
    int[] arr = new int[size];
    Random random = new Random();
    for (int i = 0; i < size; i++) {
      arr[i] = random.nextInt(1000);
    }
    println("Random array:");
    printArray(arr);

    int max = arr[0];
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) { //i starts at 1 not 0
      if (max < arr[i]) {
        max = arr[i];
      }
      min = min > arr[i] ? arr[i] : min;
    }
    println("The largest number in array:" + max);
    println("The smallest number in array:" + min);
  }
}
