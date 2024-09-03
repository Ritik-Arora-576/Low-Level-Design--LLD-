import java.util.List;

public class SortingContext {
    private SortingStrategy sortingStrategy;

    // constructor injection
    public SortingContext(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    // method to set sorting strategy
    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    // method to sort an array
    public void sort(List<Integer> arr){
        this.sortingStrategy.sort(arr);
    }
}
