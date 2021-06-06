package lesson12.fourthExample;

public class LambdaTesting {

    static int num3 = 9;

    public static void main(String[] args) {
        DoubleInterface doubleInterface;
        doubleInterface = () -> 123.45;
        Double x = doubleInterface.myDouble();
        System.out.println(x);


        int num = 10;
        final int newNum;
        MyFunction myLambda = (n) -> {
            // Такое применение переменной num допустимо, поскольку она не видоизменяется
            int v = num + n;

            //Но следующая строка кода недопустима, поскольку в ней предпринимается попытка видоизменить
            //значение переменной num
//            num++;
            num3++;
            return v;
        };
    //И следующая строка кода приведет к ошибке, поскольку в ней нарушается действительно конечное состояние
    // переменной num
//        num = 9;
    }

}

