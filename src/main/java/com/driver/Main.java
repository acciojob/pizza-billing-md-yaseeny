package com.driver;

public class Main {
  public static void main(String[] args) {
    com.driver.DeluxePizza dp = new com.driver.DeluxePizza(true);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());


    com.driver.Pizza p = new com.driver.Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}