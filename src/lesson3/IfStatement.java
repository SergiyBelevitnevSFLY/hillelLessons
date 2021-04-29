package lesson3;


import java.util.Scanner;

public class IfStatement {
// Есть игра у тебя уровень жизни, если берешь аптечку то уровень 100
    public static void main(String[] args) {

        System.out.println("Введите взяли ли вы аптечку");
        Scanner scanner = new Scanner(System.in);
        boolean isMedKitTook = scanner.nextBoolean();
        System.out.println("Введите уровень жизни от 1 до 100");
        int lifeLevel = scanner.nextInt();
        scanner.close();

        if (isMedKitTook) {
            lifeLevel = 100;
        }

        System.out.println("Уровень жизни " + lifeLevel);




    }
}
