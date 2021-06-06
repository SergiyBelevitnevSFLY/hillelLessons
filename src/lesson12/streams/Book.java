package lesson12.streams;

public class Book {

    private double price;
    private String title;
    private CoverType coverType;
    private int quantityOfPages;
    private Author author;

    public Book(double price, String title, CoverType coverType, int quantityOfPages, Author author) {
        this.price = price;
        this.title = title;
        this.coverType = coverType;
        this.quantityOfPages = quantityOfPages;
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", title='" + title + '\'' +
                ", coverType=" + coverType +
                ", quantityOfPages=" + quantityOfPages +
                ", author=" + author +
                '}';
    }
}
