package com.codenext.day8;

public class Rectangle extends Shape {

  private double a, b;

  public Rectangle(double a, double b) {
    super("Rectangle");
    setSides(a, b);
  }

  public void setSides(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double area() {
    return a * b;
  }

  public double perimeter() {
    return (a + b) * 2;
  }
}
