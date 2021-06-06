package lesson12.secondExample;

public class DoubleTester {

    public static void main(String[] args) {

        MyDouble myDouble;
        myDouble = () -> 123.45;

        double x = myDouble.newDouble();

        System.out.println(x);

        VoidInterface voidInterface;
        voidInterface = () -> System.out.println("Something");
        voidInterface.sout();

        TwoVariables twoVariables;
        twoVariables = (s1, s2) -> s1.toUpperCase() + " " + s2.toLowerCase();
        System.out.println(twoVariables.stringOperation("hillel", "school"));
    }
}
