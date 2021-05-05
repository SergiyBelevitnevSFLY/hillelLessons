package lesson4;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
                         // 0    1    2    3
        double[] prices = {4.2, 5.3, 4.5, 5.4};
        double total = 0.0;

        double arrayElement = prices[1];
        System.out.println("Array element with index 1 " + arrayElement );

        for (int i = 0; i < prices.length; i++) {
            double currentCost = prices[i];
            System.out.println("The cost of item # " + i + " is " + currentCost);
            total = total + currentCost;
        }

        System.out.println("Your total cost is " + total);
    }
}
