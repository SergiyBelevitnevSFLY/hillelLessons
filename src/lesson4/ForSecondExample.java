package lesson4;

public class ForSecondExample {


    public static void main(String[] args) {

        String inputString = "LA 4a jjfhdjhfjasdhflsjdhfshfsf";
        boolean isStringContainsA = false;

        for (int i = 0; i < inputString.length(); i++){

            char currentChar = inputString.charAt(i);
            System.out.println("Current char is " + currentChar);
            System.out.println("Counter of iteration  " + (i+1));
            if(currentChar == 'A' | currentChar == 'a'){
                isStringContainsA = true;
                System.out.println("String contains character a");
                break;
            }
        }

        System.out.println("String contains A: " + isStringContainsA);
    }
}
