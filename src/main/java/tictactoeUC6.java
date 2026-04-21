public class tictactoeUC6 {

    // Method to print board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to update board
    public static void updateBoard(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public static void main(String[] args) {

        // Initialize board
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        System.out.println("Initial Board:");
        printBoard(board);

        // Example move
        int row = 1;
        int col = 1;
        char symbol = 'X';

        updateBoard(board, row, col, symbol);

        System.out.println("\nAfter Move:");
        printBoard(board);
    }
}