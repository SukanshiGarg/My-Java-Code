package Arrays2D_Basics;

public class Convert1Dto2D {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int m=3;
        int n=2;
        int ans[][]=construct2DArray(arr,  m , n);
        

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");

            }
            System.out.println();
           }
        }
        

        
    
    public static int[][] construct2DArray(int[] original, int m , int n){
           //Edge case 
           if(original.length != m*n){
            return new int[0][0];
           }
           int index=0;
           int result[][]= new int[m][n];
           for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                result[i][j]=original[index];

            }
           }
           return result;
    }
    
}
