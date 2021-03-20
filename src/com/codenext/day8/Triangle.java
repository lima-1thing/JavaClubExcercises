package com.codenext.day8;

import java.security.InvalidParameterException;

public class Triangle extends Shape {

  private double a, b, c;

  public Triangle(double a, double b, double c) {
    super("Triangle");
    validate(a, b, c);
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  public double area() {
    double p = perimeter() / 2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }

  @Override
  public double perimeter() {
    return a + b + c;
  }

  public double angleA() {
    return Math.toDegrees(Math.asin(height() / c));
  }

  public double getA() {
    return a;
  }

  public void setA(double newA) {
    validate(newA, this.b, this.c);
    this.a = newA;
  }

  public double getB() {
    return b;
  }

  public void setB(double newB) {
    validate(this.a, newB, this.c);
    this.b = newB;
  }

  public double getC() {
    return c;
  }

  // @Override
  // public String toString() {
  //   return String.format("Triangle with side a=%.2f, b=%.2f, c=%.2f.",
  //       this.a, this.b, this.c);
  // }

  public void setC(double newC) {
    validate(this.a, this.b, newC);
    this.c = newC;
  }

  private void validate(double a, double b, double c) {
    if (a + b <= c || b + c <= a || a + c <= b) {
      throw new InvalidParameterException(
          "Sum of any two sides should be larger than the other side!");
    }
  }

  private double height() { //private method
    return area() * 2 / b;
  }
}
