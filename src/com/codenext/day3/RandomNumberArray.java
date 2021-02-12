package com.codenext.day3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberArray {

  static void printArray(int[] arr){
    for (int i=0; i<arr.length; i++) {
      if ( i!=0 ) {//skip the first item, so we won't get , in front of it.
        System.out.print(", ");
      }
      System.out.print(String.valueOf(arr[i]));
    }
    System.out.println();
  }

  static void revertPrintArray(int[] arr){
    for (int i=arr.length-1; i>=0; i--) {
      if ( i!=arr.length-1 ) {//skip the first item, so we won't get , in front of it.
        System.out.print(", ");
      }
      System.out.print(String.valueOf(arr[i]));
    }
    System.out.println();
  }
  static public void main(String args[]){
    System.out.print("Please enter array size:");
    int size = new Scanner(System.in).nextInt();

    int[] arr = new int[size];
    for( int i=0; i<arr.length; i++){
      arr[i] = new Random().nextInt(size);
    }

    System.out.println("Array has been initialized as below:");
    printArray(new int[]{1,2,3});
    revertPrintArray(arr);

    Arrays.sort(arr);
    printArray(arr);
  }
}
