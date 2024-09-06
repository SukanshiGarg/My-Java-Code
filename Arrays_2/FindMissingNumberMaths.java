package Arrays_2;

public class FindMissingNumberMaths {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n=5;
        int ans=missing_num(arr,n);
        System.out.println(ans);

    }
    public static int missing_num(int arr[],int n){
        
        //Summation of first N numbers:
        int sum=(n*(n+1))/2;
        //summation of all the array elements
        int s2=0;
        for(int i=0; i<n-1;i++){
            s2+=arr[i];
        }

        int missingNum=sum-s2;
        return missingNum;
    }
    
}
