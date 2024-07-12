package Recursion;

public class printPath {
    public static void main(String[] args) {
        int rows=4;
        int cols=6;
        print(1,1,rows,cols," ");
    }
    public static void print(int sr,int sc,int er,int ec,String s){
        if(sr>ec || sc>ec) return;
        if(sr==er && er==ec) {
            System.out.println(s);
            return;
        }
        //go right
        print(sr+1, sc, er, ec, s+"R");
        
        //go down
        print(sr, sc+1, er, ec, s);
        
    }
    
}
