package lesson6;

public class CalculateSqureWithConstructor {


    public static void main(String[] args) {
        RectangleConstructor rectangleConstructor = new RectangleConstructor(5.0, 6.0);
        RectangleConstructor rectangleConstructor2 = new RectangleConstructor(7.0, 5.0);
        System.out.println("Perimeter " + rectangleConstructor.calculatePerimeter());
        System.out.println("Area " + rectangleConstructor.calculateArea());

        System.out.println("Perimeter 2: " + rectangleConstructor2.calculatePerimeter());
        System.out.println("Area 2: " + rectangleConstructor2.calculateArea());


        rectangleConstructor.setHeight(2.0);
        rectangleConstructor.setWidth(3.0);

        System.out.println("Perimeter of updated rectangle " + rectangleConstructor.calculatePerimeter());
        System.out.println("Area of updated rectangle " + rectangleConstructor.calculateArea());

        double height = rectangleConstructor.getHeight();
        double width = rectangleConstructor.getWidth();
    }
}
