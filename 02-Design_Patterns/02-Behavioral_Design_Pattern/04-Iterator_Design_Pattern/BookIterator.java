import java.util.List;

public class BookIterator implements Iterator<Book>{
    private List<Book> books;
    private int index;

    public BookIterator(List<Book> books){
        this.books = books;
        this.index = 0;
    }

    public Boolean hasNext(){
        return index<books.size();
    }

    public Book next(){
        if(this.hasNext()) return this.books.get(this.index++);
        return null;
    }
}
