package lesson10.exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExceptionsHandling {

    public static void main(String[] args) throws IOException {

//        readNewFile();

        List<Integer> inputArray = Arrays.asList(4, 0, 0, 8, 7, 78);
        readListAndDivide(inputArray);

        System.out.println("Program finished");
    }

    public static void readNewFile() throws IOException {

        File file = new File("/nonexisting.txt");
            file.createNewFile();

    }

    public static void readListAndDivide(List<Integer> integerList) {
        Integer sum = 0;
        Integer divider = 10;
        for (int i = 0; i < integerList.size(); i++) {

            Integer currentArrayElement = integerList.get(i);
            try  {
                sum = sum + divider / currentArrayElement;
            } catch (NullPointerException | ArithmeticException e) {
                e.printStackTrace();
                System.out.println("Please don't use null");
                throw e;
            } finally {
                System.out.println("Finally block");
            }

            System.out.println(currentArrayElement);
        }


    }
}
