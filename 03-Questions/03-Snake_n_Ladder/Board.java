import BoardPieces.*;

public class Board {
    public int size;
    private BoardPieces ladders;
    private BoardPieces snakes;

    public Board(int size, int n_ladders, int n_snakes){
        this.size = size;
        this.ladders = new Ladder(n_ladders, size);
        this.snakes = new Snake(n_snakes, size);
    }

    public boolean isWinner(int position){
        return position==size;
    }

    public int updatePosition(int position, int moves){
        if(position+moves>size) return position;
        position+=moves;

        int final_position = ladders.isPresent(position);
        if(final_position!=-1) return final_position;

        final_position = snakes.isPresent(position);
        if(final_position!=-1) return final_position;
        
        return position;
    }
}
