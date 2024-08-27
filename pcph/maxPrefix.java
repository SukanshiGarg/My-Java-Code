public class maxPrefix {
    public static void main(String[] args) {
        int arr[]={4,1,2,6,1,2};
        int maxi=arr[0];
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
            arr[i]=maxi;
        }
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]+" ");
        }
       
    }
    
}
