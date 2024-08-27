package Arrays2D_Basics;

import java.util.Scanner;

public class Transpose_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
         // Display the matrix
         transpose(matrix);
         display(matrix);

         sc.close();
    
} 
public static void display(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}

public static void transpose(int matrix[][]){
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<i;j++){
            //swapping 
            int temp= matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;

        }
    }
}
}
