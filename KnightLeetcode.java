public class KnightLeetcode {
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] != 0) return false;
        return helper(grid, 0, 0, 0);
    }

    public boolean helper(int[][] grid, int row, int col, int num) {
        int n = grid.length;
        
        // Base condition: If we have filled all positions
        if (num == n * n - 1) {
            return true;
        }
        
        // Possible knight moves
        int[] rowMoves = {-2, -2, 2, 2, -1, -1, 1, 1};
        int[] colMoves = {1, -1, 1, -1, 2, -2, 2, -2};
        
        // Try all 8 possible moves for the knight
        for (int i = 0; i < 8; i++) {
            int nextRow = row + rowMoves[i];
            int nextCol = col + colMoves[i];
            
            // Check if the next move is within bounds and the cell is not visited
            if (nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < n && grid[nextRow][nextCol] == num + 1) {
                // Mark the position as visited
                grid[nextRow][nextCol] = num + 1;
                
                // Recursively try to complete the tour from this position
                if (helper(grid, nextRow, nextCol, num + 1)) {
                    return true;
                }
                
                // Backtrack: Reset the position if the current path doesn't lead to a solution
                grid[nextRow][nextCol] = 0;
            }
        }
        
        // If no move leads to a solution, return false
        return false;
    }

    public static void main(String[] args) {
        KnightLeetcode knight = new KnightLeetcode();
        
        // Example grid
        int[][] grid = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };
        
        if (knight.checkValidGrid(grid)) {
            System.out.println("Valid knight's tour exists.");
        } else {
            System.out.println("No valid knight's tour exists.");
        }
    }
}
