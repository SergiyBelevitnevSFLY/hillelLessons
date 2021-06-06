package lesson12.firstExample;

public class LambdaTester {

    public static void main(String[] args) {
//        IntegerInterface integerInterface = new IntegerInterface() {
//            @Override
//            public int function(int i) {
//                return i * i;
//            }
//        };
//
//        int x = integerInterface.function(2);
//        System.out.println(x);


        IntegerInterface integerInterface1;
        integerInterface1 = (number) -> {
            System.out.println("Now we in lambda expression");
            number++;
            return number * number;
        };
        int y = integerInterface1.function(2);

        System.out.println(y);
    }
}
