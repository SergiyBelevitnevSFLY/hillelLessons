package lesson3;

import java.util.Scanner;

public class SwitchStatement {

    //  grade automation qa 1,2,3,4,5
    public static void main(String[] args) {

        System.out.println("Введите ваш грейд от 1 до 5 ");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        int salary = 1;
        switch (grade) {
            case 1:
            case 2:
                salary = 500;
                break;
            case 3:
                salary = 1000;
                break;
            case 4:
                salary = 1500;
                break;
            case 5:
                salary = 2500;
            default:
                salary = 0;
        }

        System.out.println("Your salary is " + salary);






    }
}
