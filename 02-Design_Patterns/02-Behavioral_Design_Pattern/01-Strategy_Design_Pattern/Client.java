import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // defining an array
        List<Integer> arr = new ArrayList<>();

        // add the elements
        arr.add(5);
        arr.add(9);
        arr.add(1);
        arr.add(15);

        // set the behavior of an object to Quick sort
        SortingContext sortingContext = new SortingContext(new QuickSort());
        sortingContext.sort(arr);

        // change the behvior of an object to Bubble Sort while runtine
        sortingContext.setSortingStrategy(new BubbleSort());
        sortingContext.sort(arr);

        // change the behvior of an object to Merge Sort while runtime
        sortingContext.setSortingStrategy(new MergeSort());
        sortingContext.sort(arr);
    }
}
