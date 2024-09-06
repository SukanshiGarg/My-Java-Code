package Arrays_2;

public class FindMissingNumberHashing {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n=5;
        int ans=missingnumb(arr,n);
        System.out.println(ans);

    }
    public static int missingnumb(int a[], int n){
        int hash[]= new int[n+1];
        //storing the frequencies
        for(int i=0 ;  i<n-1 ; i++){
            hash[a[i]]++;
        }

        //checking the frequencies from 1 to n
        for(int i=1;i<=n;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }

        
    
}
