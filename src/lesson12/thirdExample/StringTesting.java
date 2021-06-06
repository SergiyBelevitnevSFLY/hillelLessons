package lesson12.thirdExample;

public class StringTesting {

    public static void main(String[] args) {

        OperationWithString operationWithString = new OperationWithString(); //class object creation

        String inputString = "Some new string";
        System.out.println(inputString);

        StringInterface stringInterface; // functional interface declaration
        stringInterface = (s) -> operationWithString.reverse(s); // abstract method realization
        String reversedString = stringInterface.function(inputString); // invoke method
        System.out.println(reversedString);
    }
}
