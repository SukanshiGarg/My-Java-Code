package Binary_Search;

public class binary_search_iterative_approach {
    public static void main(String[] args) {
        //pre requirement : Sorted array must be present
    int arr[]={1,2,3,4,5,6,7};
    int low=0;
    int high=arr.length-1;
    int target=5;
    int flag=0;

    while(low<=high){
        int mid=low+(high-low)/2; //to avoid overflow
        if(target>arr[mid]){
            low=mid+1;
            
        }
        else if(target<arr[mid]){
            high=mid-1;
        }
        else{
            //target == arr[mid]
            System.out.println("Element found at index " + mid);
            flag++;
            break;
        }
    }
    if(flag==0) System.out.println("not present");
   
    }

    
}
