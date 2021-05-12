package lesson5;

import java.util.Scanner;

public class CreditApprove {


    /*Написать программу, которая решает делать апрув кредита или нет (true/false).
    Параметры следующие
    1 Сумма зарплаты
    2 Кредитный рейтинг
    3 стаж работы на последнем месте
    4 наличие существующих кредитов
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Please enter your credit rate: ");
        int creditRate = scanner.nextInt();

        System.out.println("Please enter your work years: ");
        int workYears = scanner.nextInt();

        System.out.println("Please enter do you have existing credit: ");
        boolean existCredit = scanner.nextBoolean();

        boolean isCreditApproved = isApproveBySalary(salary) && isApproveByCreditRating(creditRate)
                && isApproveByWorkYears(workYears) & !isExistCredits(existCredit);

        System.out.println("Your credit approved: " + isCreditApproved);

    }

    static boolean isApproveBySalary(double salary) {
        System.out.println("Your salary is :" + salary);
        return salary > 20000.0;
    }

    static boolean isApproveByCreditRating(int rate) {
        System.out.println("Your credit rating is: " + rate);
        return rate > 70;
    }

    static boolean isApproveByWorkYears(int workYears) {
        System.out.println("Your work years is : " + workYears);
        return workYears > 2;
    }

    static boolean isExistCredits(boolean isCreditAlreadyExist) {
        System.out.println("You already have credit " + isCreditAlreadyExist);
        return isCreditAlreadyExist;
    }


}
