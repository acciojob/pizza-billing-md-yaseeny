package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public static int vegPrice = 300;
    public static int nonVegPrice = 400;
    public static int cheesePrice = 80;
    public static int vegTopping = 70;
    public static int nonVegTopping = 120;
    public static int takeAwayPrice = 20;

    private Boolean isCheeseAdded;
    private Boolean isToppingAdded;
    private Boolean isTakeAwayAdded;
    private int myToppingPrice = 0;
    private int basePrice = 0;



    public static void setNonVegPrice(int nonVegPrice) {
        Pizza.nonVegPrice = nonVegPrice;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.basePrice = isVeg ? vegPrice : nonVegPrice;
        this.price = 0;
        this.bill = "";
        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isTakeAwayAdded = false;
        // your code goes here
    }

    public int getPrice(){
        this.price += basePrice;
        if(isCheeseAdded){
            this.price += cheesePrice;
        }
        if(isToppingAdded){
            this.price += myToppingPrice;

        }
        if(isTakeAwayAdded){
            this.price += takeAwayPrice;
        }
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            isCheeseAdded = true;

        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded){
            isToppingAdded = true;
            this.myToppingPrice = isVeg ? vegTopping : nonVegTopping;

        }
    }

    public void addTakeaway(){
        if(!isTakeAwayAdded){
            isTakeAwayAdded = true;
        }
        // your code goes here

    }

    public String getBill(){
        // your code goes here
        this.getPrice();
        String bill = "Base Price Of The Pizza: "+this.basePrice+"\n";
        if(isCheeseAdded) bill += "Extra Cheese Added: "+this.cheesePrice+"\n";
        if(isToppingAdded) bill += "Extra Toppings Added: "+this.myToppingPrice+"\n";
        if(isTakeAwayAdded) bill += "Paperbag Added: "+this.takeAwayPrice+"\n";
        bill += "Total Price: "+this.price+"\n";

        this.bill = bill;
        return this.bill;
    }
}
