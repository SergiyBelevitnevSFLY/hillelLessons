package lesson4;

import java.util.Scanner;

public class For {


    //кассир написать программу которая получает с клавиатуры заданное количество цен и
    // подсчитывает сумму

    public static void main(String[] args) {

        int quantity = 5;

        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Please enter the cost of item # " + (i+1));
            double currentCost = scanner.nextDouble();
            total = total + currentCost;
            if (total > 1000){
                break;
            }
        }

        System.out.println("Your total cost is " + total);
    }
}
