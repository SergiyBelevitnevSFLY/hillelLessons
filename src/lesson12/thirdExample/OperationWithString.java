package lesson12.thirdExample;

public class OperationWithString {

    String reverse(String inputString){
        System.out.println("INFO message");
        StringBuilder stringBuilder = new StringBuilder(inputString);
        return stringBuilder.reverse().toString();
    }
}
