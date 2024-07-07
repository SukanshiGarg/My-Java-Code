package Recursion;

public class firstOccur {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println(index(arr,0,3));

    }
    public static int index(int arr[], int i,int item){
        if(i==arr.length) return -1;
        if(i==item) return i;
         return index(arr,i+1,item);
    }
        
    }
    
