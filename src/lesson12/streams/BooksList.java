package lesson12.streams;

import java.util.Arrays;
import java.util.List;

public class BooksList {

    public static List<Book> allBooks(){


        return Arrays.asList(
                new Book(25.5, "Harry Potter and the Deathly Hallows", CoverType.HARD_COVER,
                        180, new Author("Joan", "Rowling",1965)),
                new Book(32.4, "The Name of the Wind ", CoverType.HARD_COVER,
                        350, new Author("Patrick", "Rothfuss",1973)),
                new Book(45.1, "The Way of Kings", CoverType.SOFT_COVER,
                        455, new Author("Brandon", "Sanderson",1975)),
                new Book(15.9, "The Wise Man's Fear", CoverType.HARD_COVER,
                        522, new Author("Patrick", "Rothfuss",1973)),
                new Book(33.4, "Words of Radiance", CoverType.SOFT_COVER,
                        321, new Author("Brandon", "Sanderson",1975)),
                new Book(21.5, "Clockwork Princess", CoverType.HARD_COVER,
                        205, new Author("Cassandra", "Clare",1973)),
                new Book(51.2, "A Storm of Swords", CoverType.SOFT_COVER,
                        187, new Author("George", "Martin",1948)),
                new Book(23.5, "A Court of Mist and Fury", CoverType.HARD_COVER,
                        604, new Author("Sarah", "Maas",1986)),
                new Book(20.7, "The House of Hades", CoverType.SOFT_COVER,
                        320, new Author("Rick", "Riordan",1964)),
                new Book(18.5, "Collected Fictions", CoverType.SOFT_COVER,
                        188, new Author("Jorge", "Borges",1899))

        );
    }
}
