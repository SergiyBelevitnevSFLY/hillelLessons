package lesson4;

import java.util.Scanner;

public class DoWhile {


    // Написать программу которая выполняет сложение двух чисел, введенных с клавиатуры.
    // Пользователь может повторять действия до тех пор, пока не скажет хватит
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("Enter first number ");
            double firstNumber = scanner.nextDouble();

            System.out.println("Enter second number ");
            double secondNumber = scanner.nextDouble();

            double sum = firstNumber + secondNumber;

            System.out.println("The sum is " + sum);
            System.out.println("would you like to enter again enter true/false");
            again = scanner.nextBoolean();

        } while (again);
    }
}
