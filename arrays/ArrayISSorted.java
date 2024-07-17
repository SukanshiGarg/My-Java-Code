import java.util.Scanner;
import java.util.Arrays;
public class ArrayISSorted {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        
        int arr[]=new int [n];
        System.out.println("Enter "+ n + " Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        //System.out.println("Is Sorted ? : "+ isSorted(arr));
        int ans[]=smallestAndLargest(arr);
        System.out.println("Smallest : " + ans[0]);
        System.out.println("Largest : "+ ans[1]);

    }
    static boolean isSorted(int[]arr){
        boolean check= true;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                //not sorted
                check=false;
                break;
            }
        }
        return check;
    }
    static void sorted(int[]arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static int[] smallestAndLargest(int arr[]){
        Arrays.sort(arr);
        int[]ans={arr[0],arr[arr.length-1]};
        return ans;
    }
    
}
