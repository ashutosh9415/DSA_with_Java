public class NQueenOneSolution {
    public static boolean isSafe(char board[][], int row, int col) {
        // check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
            return false;
        }

        // left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
            return false;
        }

        // right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
            return false;
        }

        return true;
    }

    public static boolean  nQueen(char board[][], int row) {
        if (row == board.length) {
            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {   // check if it's safe to place queen
                board[row][j] = 'Q';
                if(nQueen(board, row + 1)){
                    return true;
                }
                board[row][j] = 'x';      // backtrack
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("-----Chess Board-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if(nQueen(board, 0)){
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("Solution not possible");
        }
    }
    
}
 