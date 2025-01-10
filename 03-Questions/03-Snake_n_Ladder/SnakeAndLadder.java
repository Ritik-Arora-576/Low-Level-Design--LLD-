import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnakeAndLadder {
    private Board board;
    private List<Player> players;
    private List<Dice> dices;
    private int turn;

    public SnakeAndLadder(int board_size, int n_ladders, int n_snakes, int n_players, int n_dices){
        initialize(board_size, n_ladders, n_snakes, n_players, n_dices);
    }

    private void initialize(int board_size, int n_ladders, int n_snakes, int n_players, int n_dices){
        this.turn = 0;
        this.players = new ArrayList<>();
        this.dices = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the information about players");

        for(int i=1;i<=n_players;i++){
            System.out.println("Enter the ID and name of Player-"+i);
            int id = scanner.nextInt();
            String name = scanner.nextLine();
            this.players.add(new Player(id, name));
        }

        System.out.println("Enter the number of faces in all dices");

        for(int i=1;i<=n_dices;i++){
            System.out.println("Enter the number of faces in Dice-"+i);
            int faces = scanner.nextInt();
            this.dices.add(new Dice(faces));
        }

        this.board = new Board(board_size, n_ladders, n_snakes);
    }

    public void startGame(){
        while(true){
            int moves = 0;

            // roll all dices
            for(int i=0;i<dices.size();i++){
                moves+=dices.get(i).roll();
            }

            Player player = players.get(this.turn);
            int position = player.getPosition();
            position = board.updatePosition(position, moves);
            player.setPosition(position);

            if(board.isWinner(position)) break;

            turn = (turn+1)%players.size();
        }

        System.out.println(players.get(turn).name+" is a winner!!");
    }
}
