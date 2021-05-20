package lesson7.shape;

public class Rectangle {

    protected double length;
    protected double width;
    public double sides;
//
//    public Rectangle() {
//        System.out.println("Rectangle constructor created");
//    }

    public Rectangle(double length, double width) {
        System.out.println("Parametrized constructor created");
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double calculatePerimeter() {

        return (2 * length) + (2 * width);
    }

    public void print(){
        System.out.println("I am Rectangle");
    }


}
