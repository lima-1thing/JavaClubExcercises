package com.codenext.day8;

public class Shape {

  private String shapeType;

  public Shape(String shapeType) {
    this.shapeType = shapeType;
  }

  public double area() {
    return 0;
  }

  public double perimeter() {
    return 0;
  }

  @Override
  public String toString() {
    return "Shape:" + shapeType + " area:" + this.area() + " perimeter:" + perimeter();
  }

  protected void setShapeType(String shapeType) {
    this.shapeType = shapeType;
  }
}
