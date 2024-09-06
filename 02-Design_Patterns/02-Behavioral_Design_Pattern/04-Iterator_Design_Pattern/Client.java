import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter", 560));
        books.add(new Book("Rich Dad Poor Dad", 350));
        books.add(new Book("Twisted Love", 400));
        books.add(new Book("Ikigai", 700));
        books.add(new Book("Master your Emotions", 390));

        // Library: Concrete Aggregate Interface
        Library library = new Library(books);

        // Iterator: Used to iterate the collections
        Iterator<Book> iterator = library.createIterator();

        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
