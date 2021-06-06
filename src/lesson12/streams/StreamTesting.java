package lesson12.streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTesting {


    public static void main(String[] args) {

        List<Book> bookArrayList = BooksList.allBooks();

        Set<Book> softCover = bookArrayList.stream()
                .filter(book -> book.getCoverType().equals(CoverType.SOFT_COVER))
                .skip(2)
                .limit(2)
                .collect(Collectors.toSet());

        System.out.println("");

       List<Author> surNames= bookArrayList
               .stream()
               .map(Book::getAuthor)
//               .sorted()
               .collect(Collectors.toList());

//        System.out.println(surNames);

        long arraySize = bookArrayList.stream()
                .filter(x -> x.getPrice() < 30)
                .count();


//        System.out.println("Array size of books less than 30: " + arraySize);

//        boolean isPresentBookWith320Pages = bookArrayList.stream()
//                .anyMatch(book -> book.getQuantityOfPages() == 320);
//        System.out.println("Is there any book with 320 pages: " + isPresentBookWith320Pages);


        boolean isNotPresentBookWith323Pages = bookArrayList.stream()
                .noneMatch(book -> book.getQuantityOfPages() > 120 && book.getQuantityOfPages() < 323);
        System.out.println("Is there no book with 323 pages: " + isNotPresentBookWith323Pages);

        long howMuch = bookArrayList.stream()
                .filter(book -> book.getQuantityOfPages() > 120 && book.getQuantityOfPages() < 323)
                .count();
        System.out.println(howMuch);

        Book firstAnyHardCoverBook = bookArrayList.stream()
                .filter(book -> book.getCoverType().equals(CoverType.HARD_COVER))
                .findAny().get();

        System.out.println(firstAnyHardCoverBook);

//        Map map = bookArrayList.stream().collect(Collectors.toMap(k-> k.getQuantityOfPages(), v -> v.getAuthor()));
        Map map = bookArrayList.stream().collect(Collectors.toMap(Book::getQuantityOfPages, Book::getAuthor));
        System.out.println("");
        map.forEach((k, v) -> System.out.println(k + "----" + v));








    }
}
