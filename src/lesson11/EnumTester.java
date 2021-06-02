package lesson11;

public class EnumTester {


    public static void main(String[] args) {

        System.out.println(EnumExample.APPLE);
        System.out.println(EnumExample.HUAWEI);
        System.out.println(EnumExample.SAMSUNG);

        printModel(EnumExample.SAMSUNG);
        System.out.println(EnumExample.SAMSUNG.getPrice());

        System.out.println(EnumExample.SAMSUNG.getCharge());

    }


    public static void printModel(EnumExample enumExample) {
        switch (enumExample) {
            case APPLE:
                System.out.println("iOS the best");
                break;
            case SAMSUNG:
                System.out.println("Samsung the best");
                break;
            case HUAWEI:
                System.out.println("Huawei the best");
                break;

        }
    }


}
