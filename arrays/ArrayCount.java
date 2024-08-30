import java.util.Scanner;
public class ArrayCount {
    public static void  printArray(int arr[]){
        for(int i=0;i <arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int countOccurence(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count+=1;
            }

        }
        return count;

    }
    
    static int lastOccurence(int[]arr,int x){
        int lastindex=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                lastindex=i;
            }
    
        }
        return lastindex;



    }
    
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        
        int arr[]=new int [n];
        System.out.println("Enter "+ n + " Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter x : ");
        int x=sc.nextInt();

        System.out.println("Count of x : "+ countOccurence(arr, x));
        System.out.println("last occurence of x : "+ lastOccurence(arr, x));
    }
    
}
