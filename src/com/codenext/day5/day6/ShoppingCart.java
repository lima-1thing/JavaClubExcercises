package com.codenext.day5.day6;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {

  static void add(ArrayList<HashMap<String, String>> cart, String name, double unitPrice, int count,
      String imageId) {
    cart.add(new HashMap<>() {{
      put("name", name);
      put("unit_price", String.valueOf(unitPrice));
      put("count", String.valueOf(count));
      put("imageId", imageId);
    }});
  }

  static void remove(ArrayList<HashMap<String, String>> cart, int index) {
    cart.remove(index);
  }

  static double totalPrice(ArrayList<HashMap<String, String>> cart) {
    double total = 0.0;
    for (HashMap<String, String> item : cart) {
      int count = Integer.valueOf(item.get("count"));
      double unitPrice = Double.valueOf(item.get("unit_price"));
      total += count * unitPrice;
    }
    return total;
  }

  public static void main(String[] args) {
    ArrayList<HashMap<String, String>> cart = new ArrayList<>();
    add(cart, "Apple", 2.49, 5, "image_apple");
    add(cart, "Milk", 3.99, 2, "image_milk");
    add(cart, "Bread", 5.49, 1, "image_bread");

    System.out.println(cart);
    System.out.println("Total cost:" + totalPrice(cart));

    //Add cheese
    add(cart, "Cheese", 8.99, 2, "image_cheese");
    System.out.println(cart);
    System.out.println("Total cost:" + totalPrice(cart));

    //Remove Milk
    remove(cart, 1);
    System.out.println(cart);
    System.out.println("Total cost:" + totalPrice(cart));
  }
}
