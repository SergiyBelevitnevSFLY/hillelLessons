package lesson11;

import java.util.Locale;

public class StringExample {

    public static void main(String[] args) {

        String firstString = "First string  ";

        try {
            System.out.println(firstString.charAt(7));
        } catch (Exception e) {
            System.out.println("Caught");
        }

        boolean isContains = firstString.contains("t");

        System.out.println("String contains 't' " + isContains);

        String updatedString = firstString.trim();
        boolean isEquals = updatedString.equalsIgnoreCase("First String");
        System.out.println("Is equals " + isEquals);

        boolean endWith = updatedString.endsWith("ing");
        System.out.println("String end with ing " + endWith);

        boolean startWith = updatedString.startsWith("First");
        System.out.println("String start with First " + startWith);

        String emptyString = "";
        boolean isStringEmpty = emptyString.isEmpty();
        System.out.println("String empty " + isStringEmpty);


        String message = "The bananas costs %s, but apples costs %s";
        System.out.println(String.format(message, 4.3, 5.3));

        int stringLength = firstString.length();
        System.out.println("The length of string " + stringLength);

        String banana = "B a na n a";
        String newString = banana.replace("\\s", "");
        System.out.println(newString);

        String[] arrayString = "I like hillel it school".split("\\s");
        System.out.println("");

        String secondString = "I Like Hillel It school";
        String subString = secondString.substring(0, 11);
        System.out.println(subString);

        String inUpperCase = secondString.toUpperCase();
        System.out.println(inUpperCase);
        System.out.println(secondString.toLowerCase());

        String trueString = String.valueOf(3456);

        String intString = "45365436";
        Integer i = Integer.parseInt(intString);


        i++;
        System.out.println(i);

        System.out.println(645475);
        System.out.println( trueString.toUpperCase() );

        StringBuilder stringBuilder = new StringBuilder("StringBuilder string");
        String stringFromStringBuilder = stringBuilder.insert(6, " *insert* ").toString();
        System.out.println(stringFromStringBuilder);

        String stringFromStringBuilder2 =  stringBuilder.delete(0, 5).toString();
        System.out.println(stringFromStringBuilder2);

        String stringFromStringBuilder3 =  stringBuilder.reverse().toString();
        System.out.println(stringFromStringBuilder3);




    }
}
