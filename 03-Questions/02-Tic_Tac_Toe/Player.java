import Piece.PlayingPiece;

public class Player {
    int id;
    String name;
    PlayingPiece piece;

    public Player(int id, String name, PlayingPiece piece){
        this.id = id;
        this.name = name;
        this.piece = piece;
    }
}
