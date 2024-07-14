public class NQueens{
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n]; // dimensions of the board
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nqueen(board, 0);
    }
    
    public static void nqueen(char[][] board, int row) {
        int n = board.length;
        // base condition: if all queens are placed
        if(row == n) {
            // print the board configuration
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        
        // try placing queen in each column of the current row
        for(int j = 0; j < n; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';  // place queen
                nqueen(board, row + 1);  // recurse to place queen in the next row
                board[row][j] = 'X';  // backtrack
            }
        }
    }
    
    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        
        // check if there is a queen in the current column
        for(int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }
        
        // check upper-left diagonal
        for(int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        
        // check upper-right diagonal
        for(int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        
        return true;  // board[row][col] is safe
    }
}
