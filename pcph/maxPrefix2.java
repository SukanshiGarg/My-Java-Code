public class maxPrefix2{
    public static void main(String[] args) {
        int arr[]={3,4,2,9,6,10};
        int max=0;
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
             max=Math.max(arr[i],max);
             ans[i]=max;
             System.out.print(ans[i]+" ");
        }
        

    }
}