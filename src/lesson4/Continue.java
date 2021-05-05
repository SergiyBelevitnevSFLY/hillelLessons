package lesson4;

import java.util.Scanner;

public class Continue {




    // кассир написать программу которая получает с клавиатуры заданное
    // количество цен продуктов и подсчитывает сумму, скипает если цена продукта больше 200

    public static void main(String[] args) {

        int quantity = 3;

        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Please enter the cost of item # " + (i+1));
            double currentCost = scanner.nextDouble();

            if (currentCost > 200){
                System.out.println("Skipping the product with price " + currentCost);
                return;
            }
            System.out.println("Product with price " + currentCost + " was added to cart");
            total = total + currentCost;
        }

        System.out.println("Your total cost is " + total);
    }
}
