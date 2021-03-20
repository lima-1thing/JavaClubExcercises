package com.codenext.day8;

public abstract class Shape {

  private String shapeType;

  public Shape(String shapeType) {
    this.shapeType = shapeType;
  }

  public abstract double area();

  public abstract double perimeter();

  @Override
  public String toString() {
    return "Shape:" + shapeType + " area:" + this.area() + " perimeter:" + perimeter();
  }

  protected void setShapeType(String shapeType) {
    this.shapeType = shapeType;
  }
}
