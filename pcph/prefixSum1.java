public class prefixSum1 {
    public static void main(String[] args) {
        //take an array
        int arr[]={1,2,3,4,5,6};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i]=sum;
            System.out.print(arr[i]+" ");
        }
    }
    
}
