package com.codenext.day5;

import static com.codenext.util.Utils.print;
import static com.codenext.util.Utils.printArray;
import static com.codenext.util.Utils.println;
import static com.codenext.util.Utils.randomArray;

import java.util.Scanner;

public class SortArray {
  public static void main(String args[]) {
    print("Please enter array size:");
    int size = new Scanner(System.in).nextInt();
    if (size <= 0) {
      println("Array size must be larger than 0!");
      return;
    }

    int[] arr = randomArray(size);

    for(int i=0; i<arr.length-1; i++) {

      //Find the smallest number from i to end of the array
      int indexMin=i;
      for(int j=i+1; j<arr.length; j++){
        if (arr[j] < arr[indexMin]){
          indexMin = j;
        }
      }

      //swap the ith number with the smallest
      int temp = arr[indexMin];
      arr[indexMin] = arr[i];
      arr[i] = temp;
    }
    println("Array after sorting:");
    printArray(arr);

  }
}
