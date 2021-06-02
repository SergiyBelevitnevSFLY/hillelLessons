package lesson8.product;

public class Milk implements Product, BarCode {

    private double price;
    private String name;
    private String color;
    private String weight;
    private double fatness;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

        this.name = name;

    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public void setColor(String color) {

    }

    @Override
    public void setBarcode(String barcode) {

    }

    @Override
    public String toString() {
        return "Milk{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", fatness=" + fatness +
                '}';
    }
}
