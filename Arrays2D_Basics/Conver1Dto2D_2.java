package Arrays2D_Basics;

public class Conver1Dto2D_2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int m=3;
        int n=2;
        int ans[][]=convert_arrays(arr,  m , n);
        

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");

            }
            System.out.println();
           }
        }
    
    public static int[][] convert_arrays(int original[], int m ,int n){

        //edge case :
        if(original.length != m*n){
            return new int[0][0];
        }
        int index=0;
        int result[][] = new int [m][n];

        for(int i=0;i<original.length;i++){
            // alot space in 2d arrays
            int row=i/n;
            int column=i%n;

            result[row][column]=original[i];
        }

        return result;
    }
    
}
