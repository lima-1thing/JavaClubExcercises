package com.codenext.day7;

import static com.codenext.util.Utils.println;

public class TestTriangle {

  public static void main(String[] args) {
    Triangle t = new Triangle(100, 100, 100);
    println("t:" + t);
    println("Area:" + t.area());
    println("Perimeter:" + t.perimeter());
    println("Angle A:" + t.angleA());

    try {
      new Triangle(100, 100, 200);
    } catch (Exception e) {
      e.printStackTrace();
      println("Invalid triangle:" + e);
    }
  }
}
