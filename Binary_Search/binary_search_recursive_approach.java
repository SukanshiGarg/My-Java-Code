package Binary_Search;

public class binary_search_recursive_approach {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int result = binarySearch(arr, target, 0, arr.length - 1);

        
    }

    //recursive binary search functions
    public static int binarySearch(int arr[],int target , int left ,int right){
        //base condition : target not found
        if(left>right){ 
            return -1;
        }

        //find the middle index
        int mid=left+(right-left)/2;

        //Check if the middle element is the target
        if(arr[mid]==target){
            return mid;
        }

        //if target is smaller than mid, search the left half 
        if(arr[mid] > target){
            binarySearch(arr, target, left, mid-1);
        }

        //otherwise, search the right half 
        return binarySearch(arr, target, mid+1, right);
    }
    
}
