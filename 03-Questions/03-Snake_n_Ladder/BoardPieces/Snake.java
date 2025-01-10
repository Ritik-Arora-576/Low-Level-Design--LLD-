package BoardPieces;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Snake implements BoardPieces{
    public int snakes;
    Map<Integer, Integer> m;

    public Snake(int snakes, int cells){
        this.snakes = snakes;
        this.m = new HashMap<Integer, Integer>();
        initialize(cells);
    }

    @Override
    public void initialize(int cells){
        System.out.println("Place the snakes into a board");
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<=snakes;i++){
            System.out.print("Enter the starting and ending of Snake-"+i+": ");
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            if(start<=0 || end>cells || start<end){
                System.out.println("Invalid entry please try again");
                i--;
                continue;
            }

            m.put(start, end);
        }
    }

    @Override
    public int isPresent(int position){
        if(m.containsKey(position)) return m.get(position);
        return -1;
    }
}
