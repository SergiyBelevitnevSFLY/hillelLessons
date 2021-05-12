package lesson5;

public class SumOfArrayElements {

    public static void main(String[] args) {

        int[] intArray = {3, 5, 6 , 2, 1};
        double[] doubleArray = {3.5, 5.1, 6.1 , 2.3, 1.6};
        System.out.println("Sum of input int array is: " + sumOfArrayElements(intArray));
        System.out.println("Sum of input double array is: " + sumOfArrayElements(doubleArray));

    }

    static int sumOfArrayElements(int[] arrayOfInt){
        int sum = 0;
        for (int elementOfArray : arrayOfInt) {
            sum = sum + elementOfArray;
        }
        return sum;
    }

    static double sumOfArrayElements(double[] arrayOfInt){
        double sum = 0;
        for (double elementOfArray : arrayOfInt) {
            sum = sum + elementOfArray;
        }
        return sum;
    }
}
