package BoardPieces;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ladder implements BoardPieces{
    public int ladders;
    Map<Integer, Integer> m;

    public Ladder(int ladders, int cells){
        this.ladders = ladders;
        this.m = new HashMap<Integer, Integer>();
        initialize(cells);
    }

    @Override
    public void initialize(int cells){
        System.out.println("Place the ladder into a board");
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<=ladders;i++){
            System.out.print("Enter the starting and ending of ladder-"+i+": ");
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            if(start<=0 || end>cells || start>end){
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
