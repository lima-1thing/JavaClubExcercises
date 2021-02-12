package com.codenext.day4;

/*
Print a right and isosceles triangle
*
**
***
****
*****
******
*******
********
*********
**********

          *
         ***
        *****
       *******
      *********
     ***********
    *************
   ***************
  *****************
 *******************
 */
public class Triangle {
  static void print(String s){
    System.out.print(s);
  }
  static void println(String s){
    System.out.println(s);
  }
  static void println(){
    System.out.println();
  }
  static void printIsoscelesTriangle(int size){
    for(int i=0; i<size; i++){
      //print padding
      for( int j=size-i-1; j>=0; j--){
        print(" ");
      }
      for( int j=0; j<i+i+1; j++){
        print("*");
      }
      println();
    }
  }
  static void printRightTriangle(int size){
    for(int i=0; i<size; i++){
      for( int j=0; j<=i; j++){
        print("*");
      }
      println();
    }
  }
  static public void main(String args[]){
    int size=10;
    printRightTriangle(size);
    printIsoscelesTriangle(size);
  }
}
