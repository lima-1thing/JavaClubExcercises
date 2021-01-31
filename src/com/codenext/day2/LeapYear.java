package com.codenext.day2;

import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    System.out.print("Please input a year:");
    String strYear = new Scanner(System.in).nextLine();
    int year = Integer.parseInt(strYear);
    if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
      System.out.println("Year " + year + " is a leap year!");
    } else {
      System.out.println("Year " + year + " is not a leap year.");
    }
  }
}
