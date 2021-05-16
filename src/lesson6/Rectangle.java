package lesson6;

public class Rectangle {

    double width = 4.0;   // переменные экземпляра, глоб переменные
    double length = 5.0;

   public static double staticWidth = 4.0;   // переменные класса, глоб переменные
    public static double staticLength = 5.0;

    public double getSquare() {  // метод класса


        getSquareStatic();
        return width * length;
    }

    public static double getSquareStatic(){
//        getSquare();
        System.out.println("static get square");
        return staticLength*staticWidth;
    }

}
