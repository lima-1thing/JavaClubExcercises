package com.codenext.day8;

public class EquilateralTriangle {
  public IsoscelesTriangle(double equalSide, double c) {
    this.a = equalSide;
    this.b = equalSide;
    this.c = c;
  }

  public double area() {
    double p = perimeter() / 2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }

  public double perimeter() {
    return a + b + c;
  }
  private double a, b, c;

}
