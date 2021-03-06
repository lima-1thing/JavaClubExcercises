package com.codenext.day7;

import static com.codenext.util.Utils.println;

public class TestShoppingCart {

  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    println("\nInitialize cart..");
    cart.add(new Merchandise("Apple", 2.49, 5, "image_apple"));
    cart.add(new Merchandise("Milk", 3.99, 2, "image_milk"));
    cart.add(new Merchandise("Bread", 5.49, 1, "image_bread"));

    println(cart.toString());
    println("Total cost:" + cart.totalPrice());

    //Add cheese
    println("\nAdding cheese..");
    cart.add(new Merchandise("Cheese", 8.99, 2, "image_cheese"));
    println(cart.toString());
    println("Total cost:" + cart.totalPrice());

    //Remove Milk
    println("\nRemove milk..");
    cart.remove(1);
    println(cart.toString());
    println("Total cost:" + cart.totalPrice());
  }
}
