package lesson5;

public class SumTwoValues {

    public static void main(String[] args) {

        double firstSum = sumValues(5.4, 6.4, 5);
        System.out.println(firstSum);
    }

    static double sumValues(double i1, double i2, double i3){
        return i1 + i2 + i3;
    }

    static double sumValues(double i1, double i2){
        return i1 + i2;
    }

    static double sumValues(double i1, double i2, int i3){
        return i1 + i2 + i3;
    }
}
