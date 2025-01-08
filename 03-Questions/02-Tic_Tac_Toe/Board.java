import Piece.PlayingPiece;
import Piece.pieceType;

public class Board {
    public int size;
    public PlayingPiece[][] board;
    public int empty_slots;

    public Board(int size){
        this.size = size;
        this.board = new PlayingPiece[size][size];
        this.empty_slots = size*size;
    }

    public Boolean placePiece(int row, int col, PlayingPiece piece){
        if(row>=0 && col>=0 && row<size && col<size && board[row][col]==null){
            board[row][col]=piece;
            empty_slots--;
            return true;
        }
        return false;
    }

    public Boolean isWinner(){
        for(int i=0;i<size;i++){
            int n=0;
            for(int j=0;j<size;j++){
                if(board[i][j]!=null && board[i][j].type==pieceType.O) n++;
                else if(board[i][j]!=null && board[i][j].type==pieceType.X) n--;
            }
            if(Math.abs(n)==size) return true;
        }

        for(int i=0;i<size;i++){
            int n=0;
            for(int j=0;j<size;j++){
                if(board[j][i]!=null && board[j][i].type==pieceType.O) n++;
                else if(board[j][i]!=null && board[j][i].type==pieceType.X) n--;
            }
            if(Math.abs(n)==size) return true;
        }
        
        int n = 0;

        for(int i=0;i<size;i++){
            if(board[i][i]!=null && board[i][i].type==pieceType.O) n++;
            else if(board[i][i]!=null && board[i][i].type==pieceType.X) n--;
        }

        if(Math.abs(n)==size) return true;

        n = 0;

        for(int i=0;i<size;i++){
            if(board[i][size-i-1]!=null && board[i][size-i-1].type==pieceType.O) n++;
            else if(board[i][size-i-1]!=null && board[i][size-i-1].type==pieceType.X) n--;
        }

        if(Math.abs(n)==size) return true;

        return false;
    }

    public void showBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null) System.out.print("- ");
                else if(board[i][j].type==pieceType.O) System.out.print("O ");
                else System.out.print("X ");
            }
            System.out.println(" ");
        }
    }
}
