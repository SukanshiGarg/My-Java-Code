package basic;

public class sortBubble {
    public static void Sort(int arr[]){
        for(int turn=1; turn<arr.length; turn++){
            for(int i=0 ; i<arr.length-i-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,3,2,1};
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
