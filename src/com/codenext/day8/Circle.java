package com.codenext.day8;

public class Circle {

  private double r;

  public Circle(double r) {
    setRadius(r);
  }

  public void setRadius(double r) {
    this.r = r;
  }

  public double area() {
    return r * r * Math.PI;
  }

  public double perimeter() {
    return 2 * r * Math.PI;
  }
}
