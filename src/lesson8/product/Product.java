package lesson8.product;

public interface Product {
    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    default void someMethod() {
    }

    static void someStaticMethod(){
    }
}
