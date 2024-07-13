package Recursion;

public class RatInAMaze3 {

    public static void main(String[] args) {
        int rows=3;
        int cols=4;
        int maze[][]={{1,0,1,1},
                      {1,1,1,1},
                      {1,1,0,1},};
    print(0,0,rows-1,cols-1,"",maze);
}

    
    public static void print(int sr,int sc,int er, int ec,String s , int [][]maze){
        //check the base conditions
        // 1: Check if it out of bounds
        // 2: Check if its blocked or already visited 
    if(sr<0 || sc<0 || sr>er || sc>ec|| maze[sr][sc] ==0 || maze[sr][sc]==2)
    return;
    if(sr==er && sc==ec){
        //reached towards the end
        System.out.println(s);
        return;
    }
    //Mark that the cell is visted 
    maze[sr][sc]=2;

    //Explore all the directions
    print(sr+1, sc, er, ec, s+"D", maze);//go down
    print(sr-1, sc, er, ec, s+"U", maze);//go up
    print(sr, sc+1, er, ec, s+"R", maze);//go right
    print(sr, sc-1, er, ec, s+"L", maze);// go left

    //Backtracing: Re-storing all the original values
        maze[sr][sc]=1;
    

        
    

    }
}


