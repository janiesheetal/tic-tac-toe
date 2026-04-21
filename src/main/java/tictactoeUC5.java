public class tictactoeUC5 {

    // Method to validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check boundaries
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        // Create board
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        // Example test
        int row = 1;
        int col = 1;

        if (isValidMove(board, row, col)) {
            System.out.println("Valid move ✅");
        } else {
            System.out.println("Invalid move ❌");
        }

        // Try marking and testing again
        board[row][col] = 'X';

        if (isValidMove(board, row, col)) {
            System.out.println("Valid move ✅");
        } else {
            System.out.println("Invalid move ❌");
        }
    }
}