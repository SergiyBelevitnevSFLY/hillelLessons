package lesson8.cement;

public class CementPreparation {

    private double cementQuantity;

    public CementPreparation(Shape shape) {
        setCementQuantity(shape.calculateArea() * 10);
    }

    public double getCementQuantity() {
        return cementQuantity;
    }

    public void setCementQuantity(double cementQuantity) {
        this.cementQuantity = cementQuantity;
    }
}
