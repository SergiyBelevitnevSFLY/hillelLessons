package lesson6;

public class CalculateTotalRooms {



    public double calculateTotalOfTwoRooms(RectangleConstructor rectangleConstructor1, RectangleConstructor rectangleConstructor2){

        return rectangleConstructor1.calculateArea() + rectangleConstructor2.calculateArea();
    }

    public static void main(String[] args) {
        CalculateTotalRooms calculateTotalRooms = new CalculateTotalRooms();

        RectangleConstructor rectangleConstructor1 = new RectangleConstructor(4.0,4.0);
        RectangleConstructor rectangleConstructor2 = new RectangleConstructor(5.0,3.0);

        double totalArea = calculateTotalRooms.calculateTotalOfTwoRooms(rectangleConstructor1,rectangleConstructor2);

        System.out.println("Total area " + totalArea);
    }
}
