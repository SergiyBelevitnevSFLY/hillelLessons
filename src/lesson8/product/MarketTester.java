package lesson8.product;

public class MarketTester {

    public static void main(String[] args) {
        Book book = new Book();

        book.setPrice(4.2);
        book.setName("Azbuka");
        book.setColor("Red");

        book = new Book();

        System.out.println("Price of book is " + book.getPrice());
        System.out.println("Name of book is " + book.getName());
        System.out.println("Color of book is " + book.getColor());

    }
}
