package lesson3;

import java.util.Scanner;

public class IfElseStatement {


    // Если закончил уровень на месте 1-3? то переходишь на след уровень и доб 10 монет
    // если не прошел? то количество жизней уменьшается
    public static void main(String[] args) {

        int currentLevel = 7;
        int levelCoin = 15;
        int lifeCount = 1;

        System.out.println("Введите на каком месте закончили");
        Scanner scanner = new Scanner(System.in);
        int levelScore = scanner.nextInt();
        scanner.close();

        if (levelScore < 4) {
            currentLevel++;
            levelCoin = levelCoin + 10;
            System.out.println("");
        } else {
            lifeCount --;
        }

        System.out.println("You've finished on score " +levelScore
        + " Your current level is " + currentLevel +
                " Your coin level is " + levelCoin+
                " You have " + lifeCount +  " lifes");


    }
}
