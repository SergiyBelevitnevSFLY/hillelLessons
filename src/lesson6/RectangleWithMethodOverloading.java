package lesson6;

public class RectangleWithMethodOverloading {

    private double width;
    private double height;
    private double area;

    public RectangleWithMethodOverloading(double width) {
        this.width = width;
        setArea(width * width);
    }

    public RectangleWithMethodOverloading(double width, double height) {
        this.width = width;
        this.height = height;
        setArea(width * height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
