import java.util.*;

public class SortArrays0s1s2s {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // Swapping arr[low] and arr[mid]
                Collections.swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                // Swapping arr[mid] and arr[high]
                Collections.swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>();
        // Directly adding elements to the ArrayList
        arr.add(0);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(0);
        arr.add(1);

        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
}


/*
                                            (Without using Collectiobns Array-List swapping )
import java.util.*;
public class SortArrays0s1s2s {
    public static void sortArray(ArrayList<Integer> arr , int n ){
        //use three pointers 
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<= high){
            if(arr.get(mid)==0){
                //swapping arr[low] and arr[mid]
                int temp= arr.get(low);
                arr.set(low,arr.get(mid));
                arr.set(mid,temp);

                low++;
                mid++;
            }

            else if(arr.get(mid)==1){
                mid++;
            }

            else{
                //swapping arr[mid] and arr[high]
                int temp=arr.get(mid);
                arr.set(mid,arr.get(high));
                arr.set(high,temp);

                high--;
            }



        }

    }
    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 0, 2, 1, 2, 0, 1);

        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
    
}
 */