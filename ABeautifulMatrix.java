import java.util.*;
public class ABeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[][]=new int[5][5];
        int rowPos=0,colPos=0;

        //reading the input matrix  and finding the position of 1
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1){
                    rowPos=i+1;
                    colPos=j+1;
                }
            }
        }
        int moves=Math.abs(3-rowPos)+Math.abs(3-colPos);

        //Output
        System.out.println(moves);
        sc.close();
    }
    
}
