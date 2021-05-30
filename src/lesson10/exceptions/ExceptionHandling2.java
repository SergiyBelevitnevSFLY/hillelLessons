package lesson10.exceptions;

import java.util.Arrays;
import java.util.List;

public class ExceptionHandling2 {


    public static void main(String[] args) throws Exception {

        List<Integer> inputArray = Arrays.asList(4, 4, 5, 8, 7, 78);
        readListAndDivide(inputArray);
    }


    public static void readListAndDivide(List<Integer> integerList) throws Exception {
        Integer sum = 0;
        Integer divider = 10;
        for (int i = 0; i < integerList.size(); i++) {


            Integer currentArrayElement = integerList.get(i);

            if (currentArrayElement == 5){
                throw new Exception("We don't want see 5");
            }
                sum = sum + divider / currentArrayElement;


            System.out.println(currentArrayElement);
        }


    }
}
