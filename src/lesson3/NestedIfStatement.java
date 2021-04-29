package lesson3;

import java.util.Scanner;

public class NestedIfStatement {

    public static void main(String[] args) {

        System.out.println("Введите взяли ли вы аптечку");
        Scanner scanner = new Scanner(System.in);
        boolean isMedKitTook = scanner.nextBoolean();
        System.out.println("Введите уровень жизни от 1 до 100");
        int lifeLevel = scanner.nextInt();
        scanner.close();

        if (isMedKitTook) {
            if (lifeLevel > 50) {
                lifeLevel = 100;
            } else {
                lifeLevel = 75;
            }
        }

        System.out.println("Уровень жизни " + lifeLevel);
    }
}
