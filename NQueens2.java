// sm 

import java.util.*;


public class NQueens2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [][] chess = new int [n][n];
        printNQueens(chess,"",0);

    }
    public static void printNQueens(int [][] chess,String qsf, int row){
        if(row==chess.length){
            System.out.println(qsf);
            return;
        }
        for(int col=0;col<chess.length;col++){
            if(isSafe(chess,row,col)){
            chess[row][col]=1; //edge ke left side
            printNQueens(chess ,  qsf+row+"-"+col+",",  row+1);
            chess[row][col]=0; //edge ke right side 
            }
        }
    }
    //There is no queen below so no check for that
    public static boolean isSafe(int [][]chess,int row, int col){
        for(int i=row-1, j=col;i>=0 ;i--){ //vertical check 
            if(chess[i][j] == 1){
                return false;
            }
        }
        //lefty-diagonal
        for(int i=row-1,j=col-1; i>=0 && j>=0 ; i-- , j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        //right digonal
        for(int i=row-1,j=col+1; i>=0 && j<chess.length; i-- , j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
    
}
