package com.codenext.day8;

public class IsoscelesTriangle {

  public IsoscelesTriangle(double equalSide, double c) {
    setSides(equalSide, c);
  }
  public void setSides(double equalSide, double c) {
    this.a = equalSide;
    this.b = equalSide;
    this.c = c;
  }
  public void setSideAndAngle(double equalSide, double angle) {
    this.a = equalSide;
    this.b = equalSide;
    this.c = Math.sin(Math.toRadians(angle))*equalSide;
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