package com.codenext.day7;

public class Merchandise {

  public Merchandise(String name, double unitPrice, int count,
      String imageId) {
    this.name = name;
    this.unitPrice = unitPrice;
    this.count = count;
    this.imageId = imageId;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public double calcCost() {
    return this.unitPrice * this.count;
  }

  @Override
  public String toString() {
    return "Merchandise{" +
        "name='" + name + '\'' +
        ", unitPrice=" + unitPrice +
        ", count=" + count +
        ", imageId='" + imageId + '\'' +
        '}';
  }

  private String name;
  private double unitPrice;
  private int count;
  private String imageId;
}
