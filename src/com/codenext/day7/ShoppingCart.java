package com.codenext.day7;

import java.util.ArrayList;

public class ShoppingCart {

  public ShoppingCart(){
    this.items = new ArrayList<>();
  }
  public void add( Merchandise merchandise) {
    items.add(merchandise);
  }

  public void remove( int index) {
    items.remove(index);
  }

  public double totalPrice() {
    double total = 0.0;
    for (Merchandise item : items) {
      total += item.calcCost();
    }
    return total;
  }

  @Override
  public String toString() {
    return "ShoppingCart{" +
        "items=" + items +
        '}';
  }

  private ArrayList<Merchandise> items;
}
