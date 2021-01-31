package com.codenext.day3;

import com.codenext.util.ArrayUtils;
import java.util.Random;
import java.util.Scanner;

public class RevertArray {
  static public void main(String args[]){
    System.out.print("Please enter array size:");
    int size = new Scanner(System.in).nextInt();

    int[] arr = new int[size];
    for( int i=0; i<arr.length; i++){
      arr[i] = new Random().nextInt();
    }

    System.out.println("Array has been initialized as below:");
    ArrayUtils.printArray(arr);

    for(int i=0; i<arr.length/2; i++) {
      //swap arr[i] with arr[arr.length-i-1]
      int temp = arr[i];
      arr[i] = arr[arr.length-i-1];
      arr[arr.length-i-1] = temp;
    }
    System.out.println("The reverted array is as below:");
    ArrayUtils.printArray(arr);
  }
}
