package lesson11;

import lesson8.product.Milk;

public class ToStringExample {

    public static void main(String[] args) {
        Milk milk = new Milk();
        milk.setPrice(15.3);
        milk.setName("Coconut Milk");


       String milkString = milk.toString();
        System.out.println(milkString);
    }
}
