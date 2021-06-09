package lesson13;

import lesson12.streams.Author;
import lesson12.streams.Book;
import lesson12.streams.CoverType;

import java.util.Optional;

public class OptionalExample {

    static Book externalBook = new Book(4.2,"", CoverType.HARD_COVER,123, new Author("","",1234));
    public static void main(String[] args) {

        Optional<Book> optionalOfBook = Optional.of(externalBook);
                //.orElse(new Book(4.2,"", CoverType.HARD_COVER,123, new Author("","",1234)));

        Book book = optionalOfBook.get();
        boolean b = optionalOfBook.isEmpty();
        System.out.println(book.getAuthor().toString());
//        System.out.println(externalString);


    }
}
