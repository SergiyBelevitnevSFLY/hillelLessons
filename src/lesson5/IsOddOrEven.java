package lesson5;

public class IsOddOrEven {

    public static void main(String[] args) {

        boolean isIntegerEven = isEven(12);
        System.out.println(" Integer is even: " + isIntegerEven);
    }

    static boolean isEven(int parameter) {
        boolean b = false;
        if (parameter % 2 == 0) {
            b = true;
        }
        return b;

    }
}
