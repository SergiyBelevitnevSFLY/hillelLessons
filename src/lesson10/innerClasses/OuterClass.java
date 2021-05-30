package lesson10.innerClasses;

public class OuterClass {

    private int num = 2021;

    public class InnerClass {
        public int getNum() {
            System.out.println("Это метод внутреннего класса");
            return num;
        }

    }
}
