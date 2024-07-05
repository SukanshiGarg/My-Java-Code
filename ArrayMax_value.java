public class ArrayMax_value {
    public static void main(String args[]){
        int arr[]={3,5,1,7,8,6};
        System.out.println(maximum1(arr));
        System.out.println(maximum2(arr));


    }
    public static int maximum1(int arr[]){
        int i;
        int max=arr[0];
        for(i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int maximum2(int arr[]){
        int m=Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>m){
                m=arr[i];
            }
            m=Math.max(m,arr[i]);
        }
        return m;
    }
    
}
