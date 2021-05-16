package lesson6;

public class CalculateWithMethodOverloading {

    public static void main(String[] args) {
        RectangleWithMethodOverloading rectangle = new RectangleWithMethodOverloading(6.0);

        RectangleWithMethodOverloading rectangle2 = new RectangleWithMethodOverloading(4.0, 3.0);

        double area1 = rectangle.getArea();
        double area2 = rectangle2.getArea();

        System.out.println("Area of first rectangle is " + area1);
        System.out.println("Area of second rectangle is " + area2);
    }

}
