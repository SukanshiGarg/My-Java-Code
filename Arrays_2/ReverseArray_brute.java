package Arrays_2;

public class ReverseArray_brute {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverseArray(int arr[]){
        int result[]=new int[arr.length];
        int idx=0;
        for (int i = arr.length-1; i >=0; i--) {
            result[idx]=arr[i];
            idx++;
            
        }
        // Copy the reversed result back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
    }
    
}
}
