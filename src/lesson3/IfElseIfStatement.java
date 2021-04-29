package lesson3;

import java.util.Scanner;

public class IfElseIfStatement {

    // В зависимости от баллов в ПР нам присваивается левел
    public static void main(String[] args) {

        System.out.println(" Введите свой ПР скор");
        Scanner scanner = new Scanner(System.in);
        int yourPrScore = scanner.nextInt();
        scanner.close();

        String title;

        if (yourPrScore > 150) {
            title = "Senior";
        } else if (yourPrScore > 120) {
            title = "Middle";
        } else if (yourPrScore > 100) {
            title = "Middle-";
        } else {
            title = "Junior";
        }

        System.out.println("Your title is " + title);

    }
}
