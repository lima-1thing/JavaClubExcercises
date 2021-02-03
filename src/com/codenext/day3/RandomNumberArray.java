package com.codenext.day3;

import com.codenext.util.ArrayUtils;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberArray {
  static public void main(String args[]){
    System.out.print("Please enter array size:");
    int size = new Scanner(System.in).nextInt();

    int[] arr = new int[size];
    for( int i=0; i<arr.length; i++){
      arr[i] = new Random().nextInt(size);
    }

    System.out.println("Array has been initialized as below:");
    for (int i=0; i<arr.length; i++) {
      if ( i!=0 ) {//skip the first item, so we won't get , in front of it.
        System.out.print(", ");
      }
      System.out.print(String.valueOf(arr[i]));
    }

    System.out.println();

    for (int i=arr.length-1; i>=0; i--) {
      if ( i!=arr.length-1 ) {//skip the first item, so we won't get , in front of it.
        System.out.print(", ");
      }
      System.out.print(String.valueOf(arr[i]));
    }

    Arrays.sort(arr);
    System.out.println();
    ArrayUtils.printArray(arr);
  }
}
