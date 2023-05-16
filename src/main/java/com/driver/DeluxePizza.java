package com.driver;

public class DeluxePizza extends com.driver.Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
        // your code goes here
    }
}
