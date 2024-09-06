import java.util.List;

public class Library implements Aggregate<Book>{
    private List<Book> books;

    public Library(List<Book> books){
        this.books = books;
    }

    public Iterator<Book> createIterator(){
        return new BookIterator(books);
    }
}
