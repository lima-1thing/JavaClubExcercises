package com.codenext.day4;

public class Circle {
  static void print(String s){
    System.out.print(s);
  }
  static void println(String s){
    System.out.println(s);
  }
  static void println(){
    System.out.println();
  }

  static void drawCircleRow(int r, int x){
    //padding
    for(int j=0; j<r-x; j++){
      print(" ");
    }
    //draw inner area of the circle
    for(int j=-x; j<=x; j++){
      print("*");
    }
    println();
  }
  static void circle(int r){
    for(int i=0; i<r; i++){
      int y = r - i;
      int x = (int)( Math.sqrt(r*r-y*y) + 0.5);
      drawCircleRow(r, x);
    }

    //second half of the circle
    for(int i=r-1; i>=0; i--){
      int y = r - i;
      int x = (int)( Math.sqrt(r*r-y*y) + 0.5);
      drawCircleRow(r, x);
    }
  }
  public static void main(String args[]){
    int size=10;

    circle(size);
  }
}
