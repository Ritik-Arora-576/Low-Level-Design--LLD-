import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Piece.*;

public class TicTacToe {
    public Board board;
    public List<Player> players;
    private int turn;

    public TicTacToe(){
        initializeGame();
    }

    public void initializeGame(){
        this.turn = 0;

        this.players = new ArrayList<>();
        Player player1 = new Player(1, "Ritik", new PieceX());
        Player player2 = new Player(2, "Yash", new PieceO());

        this.players.add(player1);
        this.players.add(player2);

        // initialize board
        this.board = new Board(3);
    }

    public void startGame(){
        Scanner myObj = new Scanner(System.in);
    
        while(true){
            System.out.println(players.get(turn).name + ": Please play your turn");

            int row = myObj.nextInt();
            int col = myObj.nextInt();

            Boolean status = board.placePiece(row, col, players.get(turn).piece);

            if(!status){
                System.out.println("Invalid Move... Please try again");
                continue;
            }

            turn = (turn+1)%2;

            // display current situation of game
            board.showBoard();

            if(board.isWinner() || board.empty_slots==0) break;
        }

        if(board.isWinner()){
            turn--;
            if(turn==-1) turn=1;
            System.out.println(players.get(turn).name + " is a winner !!!");
        }

        else System.out.println("Game Tied");
    }
}
