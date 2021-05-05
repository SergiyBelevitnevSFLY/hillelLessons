package lesson4;

public class ArrayForEach {


    public static void main(String[] args) {
                         // 0    1    2    3
        double[] prices = {4.2, 5.3, 4.5, 5.4};
        double total = 0.0;

        double arrayElement = prices[1];
        System.out.println("Array element with index 1 " + arrayElement );

        for (double currentPrice : prices) {

            System.out.println("Current price is " + currentPrice);
            total = total + currentPrice;

        }

        System.out.println("Your total cost is " + total);
    }
}
