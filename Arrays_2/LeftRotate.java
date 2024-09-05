package Arrays_2;
                    // using temporaray array 
                    //better approach
public class LeftRotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=2;
        leftrotation(arr,k);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void leftrotation(int arr[],int k){
        int temp[]=new int[k];
        int n=arr.length;

        //store the k elements in a temporary array
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }

        //now, store the n-k elements to starting of the original array
        for(int i=k;i<arr.length;i++){
           arr[i-k]=arr[i];
        }

        //step 3: place the elements of the temporary elements in the last d places of the given array

        for(int i=n-k ; i< arr.length ;i++){
             arr[i]=temp[i-(n-k)];
        }

        // 1 2 3 4 5 6 7 8             //  3 4 5 6 7 8  1 2 
        // 0 1 2 3 4 5 6 7 

        // k=2
    }
    
}
