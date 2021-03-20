package com.codenext.day8;

import java.util.ArrayList;

public class ShapeTest {

  public static void main(String[] args) {
    ArrayList<Shape> shapes = new ArrayList<>();
    shapes.add(new Triangle(100,200, 150));
    shapes.add(new IsoscelesTriangle(100,150));
    shapes.add(new EquilateralTriangle(100));
    shapes.add(new Rectangle(100,200));

    System.out.println(shapes);
  }
}
