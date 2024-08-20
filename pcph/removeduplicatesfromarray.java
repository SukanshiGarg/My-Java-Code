package pcph;
import java.util.*;
public class removeduplicatesfromarray {
    public static int[] removeDuplicates( int arr[]){
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        return Arrays.copyOfRange(arr, 0, j+ 1);;
    }
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 2, 2, 3, 4, 5, 5, 5, 6, 6, 6, 7};
        int ans[] = removeDuplicates(arr);

        // Print only the unique elements
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    
}
}
