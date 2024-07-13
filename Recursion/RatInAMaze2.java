package Recursion;
public class RatInAMaze2{
    public static void main(String[] args) {
        int rows=3;
        int cols=4;
        int maze[][]={{1,0,1,1},
                      {1,1,1,1},
                      {1,1,0,1},};

        //Create a visited matrix intialized to false
        boolean[][] isVisited = new boolean[rows][cols];
        print(0,0,rows-1,cols-1,"",maze,isVisited);}
        
    public static void print(int sr,int sc,int er,int ec,String s,int [][]maze,boolean[][] isVisited){
        //Check if current position is out of bounds or 
        // Check if it's blocked cell 
        //Check if it's already visited 
        if(sr<0 || sc<0 || sr>er || sc>ec || maze[sr][sc]==0 || isVisited[sr][sc]){
            return;
        }

        //Check if we have reached the end(bottom - end corner )
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }

        //Mark the current cell as Visited 
        isVisited[sr][sc]=true;

        //Explore all the four directions
        print(sr+1, sc, er, ec, s+"R", maze, isVisited); //go right
        print(sr, sc+1, er, ec, s+"D", maze, isVisited); //do down
        print(sr-1, sc, er, ec, s+"U", maze, isVisited);// go up
        print(sr, sc-1, er, ec, s+"L", maze, isVisited); // go left 

        //Backtracking : Unmark the current cell
        isVisited[sr][sc]=false;

    }

}