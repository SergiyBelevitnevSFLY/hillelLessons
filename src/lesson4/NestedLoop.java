package lesson4;

import java.util.Scanner;

public class NestedLoop {

    //В классе 21 студент, каждый сдавал 4 экзамена
    // (есть результат по каждому экзамену), подсчитать для каждого студента средний балл)
    public static void main(String[] args) {

        int numberOfStudents = 21;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);
         for (int currentStudent = 0; currentStudent < numberOfStudents; currentStudent++) {
             double total = 0;
             for (int currentTest = 0; currentTest < numberOfTests; currentTest++){
                 System.out.println("Enter the score of test " + (currentTest +1) +
                         " of student # " + (currentStudent+1));
                 double score = scanner.nextDouble();
                 total = total + score;
             }
             double average = total / numberOfTests;

             System.out.println("test average for student # " + (currentStudent+1)+ " is " + average);
         }
    }
}
