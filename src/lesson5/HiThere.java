package lesson5;

public class HiThere {

    public static void main(String[] args) {
//
//
//        System.out.println("Hello Guys");
//        System.out.println("Hello Girls");
//        System.out.println("Hello Hillel");

        HiWithConstructor hiWithConstructor = new HiWithConstructor("Billy");

    }

    static void printTheName(String name) {
        System.out.println("Hello " + name);
    }
}
