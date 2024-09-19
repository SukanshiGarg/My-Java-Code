public class PrefixSumOptimised {
    public static int[] calculatePrefixSum(int []arr){
        int n=arr.length;
        int[] prefixSumArr=new int[n];

        prefixSumArr[0]=arr[0];

        for(int i=1;i<n;i++){
            prefixSumArr[i]=prefixSumArr[i-1]+arr[i];
            //add the current elemnet to the previous sum
        }
        return prefixSumArr;


        

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int[] prefixSumArr = calculatePrefixSum(arr);

        //priny the prefix sum array
        for (int sum : prefixSumArr) {
            System.out.print(sum + " ");
        }

        
    }
}
