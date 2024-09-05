package Arrays_2;
import java.util.ArrayList;;
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = movezero(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
    

   public static int[] movezero(int[] arr, int n) {
        //make another temporary arraylist to store all the non-zero numbers from the array list
        ArrayList<Integer> temp = new ArrayList<>();

        //copy all the non-zero number from the array into the array list
        for(int i=0; i<n ;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }

        //count the number of the non-zero elements in the array 
        int nz=temp.size();

        //put the elements back to the original array
        for(int i=0;i<nz;i++){
            arr[i]=temp.get(i);
        }

        //complete the rest of the elements of the array with zeros 
        for(int j=nz;j<arr.length;j++){
            arr[j]=0;
        }
        return arr;

    }
    
}
