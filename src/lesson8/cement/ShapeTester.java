package lesson8.cement;

import lesson8.product.Product;

public class ShapeTester {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(4.0, 5.0);


        Shape circle = new Circle(5.0);


        CementPreparation cementPreparation = new CementPreparation(rectangle);
        double cementForRectangle = cementPreparation.getCementQuantity();
        System.out.println("For this rectangle room we need next amount of cement " + cementForRectangle);

        CementPreparation cementPreparationForCircle = new CementPreparation(circle);
        double cementForCircle = cementPreparationForCircle.getCementQuantity();
        System.out.println("For this circle room we need next amount of cement " + cementForCircle);
    }
}
