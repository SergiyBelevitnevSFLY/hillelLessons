package lesson11;

public class RegExp {

    public static void main(String[] args) {
        String firstInputString = "fvkhovhspv";
        boolean isLiteralValues = firstInputString.matches("\\D+");
        System.out.println("Is literal values " +isLiteralValues);

        String secondInputString = "12347635467352";
        boolean isDigital = secondInputString.matches("\\d+");
        System.out.println("Is digital values " +isDigital);
//
        String thirdInputString = "1243346";
        boolean isLiteralValues2 = thirdInputString.matches("[1-7]{4,9}");
        System.out.println("Is literal values " +isLiteralValues2);
    }

    public static boolean isMoneyFormatIsCorrect(String inputString) {
        //"$123.546.423.50"      $46.423.50   $123.50
     return inputString.matches("(([$]\\d{1,3})[.](\\d{2}))$|(([$]\\d{1,3}[.]\\d{3})[.](\\d{2}))$|(([$]\\d{1,3}[.]\\d{1,3}[.]\\d{3})[.](\\d{2}))$");
}}
