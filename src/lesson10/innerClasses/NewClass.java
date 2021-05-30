package lesson10.innerClasses;

public class NewClass {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        int number = innerClass.getNum();

        System.out.println("Number " + number);
    }
}
