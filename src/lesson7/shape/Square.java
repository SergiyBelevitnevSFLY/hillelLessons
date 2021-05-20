package lesson7.shape;

public class Square extends Rectangle {

    public double sides = super.sides;

    public Square() {
        super(4.0,5.0);
        System.out.println("Square constructor created");
    }

    public static void main(String[] args) {
        Square square = new Square();
    }
}
