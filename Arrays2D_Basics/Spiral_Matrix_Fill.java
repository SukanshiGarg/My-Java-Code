package Arrays2D_Basics;
import java.util.*;
public class Spiral_Matrix_Fill {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [][]matrix = new int[n][n];

        fillSpiralMatrix(matrix,n);
        display(matrix);

        sc.close();

    }

    public static void fillSpiralMatrix(int [][]matrix,int n){
        int value=1;
        int top=0,bottom=n-1;
        int left=0,right=n-1;

        while(top<=bottom && left<=right){
            //fill the top row 
            for(int i=left;i<=)
        }
    }
    
}
