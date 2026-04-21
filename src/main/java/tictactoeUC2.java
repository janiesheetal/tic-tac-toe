import java.util.Random;

public class tictactoeUC2 {
    public static void main(String[] args) {

        String player1 = "Player 1";
        String player2 = "Player 2";

        String currentPlayer;
        char player1Symbol;
        char player2Symbol;

        Random random = new Random();
        int toss = random.nextInt(2); // 0 or 1

        if (toss == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = player2;
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        System.out.println("Toss Result:");
        System.out.println(currentPlayer + " will start the game");

        System.out.println(player1 + " symbol: " + player1Symbol);
        System.out.println(player2 + " symbol: " + player2Symbol);
    }
}