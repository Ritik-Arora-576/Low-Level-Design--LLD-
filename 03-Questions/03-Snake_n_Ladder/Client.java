import java.util.Scanner;

import BoardPieces.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game !!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Board Size: ");
        int board_size = scanner.nextInt();

        System.out.print("Enter number of ladders: ");
        int n_ladders = scanner.nextInt();

        System.out.print("Enter number of snakes: ");
        int n_snakes = scanner.nextInt();

        System.out.print("Enter number of players: ");
        int n_players = scanner.nextInt();

        System.out.print("Enter number of dices: ");
        int n_dices = scanner.nextInt();

        SnakeAndLadder game = new SnakeAndLadder(board_size, n_ladders, n_snakes, n_players, n_dices);
        game.startGame();
    }
}
