package Recursion;

public class RatInAMaze   {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 6; // Adjusted to match the actual maze dimensions
        int[][] maze = {
            {1, 0, 1, 1, 1, 1},
            {1, 1, 1, 1, 0, 1},
            {0, 1, 1, 1, 1, 1},
            {0, 0, 1, 0, 1, 1}
        };
        print(0, 0, rows - 1, cols - 1, "", maze);
    }

    public static void print(int sr, int sc, int er, int ec, String path, int[][] maze) {
        if (sr > er || sc > ec) return; // Out of bounds
        if (sr == er && sc == ec) { // Reached the end
            System.out.println(path);
            return;
        }
        if (maze[sr][sc] == 0) return; // Blocked cell

        // Explore all four possible directions

        // Go right
        print(sr, sc + 1, er, ec, path + "R", maze);

        // Go down
        print(sr + 1, sc, er, ec, path + "D", maze);

        
    }
}
