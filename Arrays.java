//ARRAY REFERENCE IN JAVA


import java.util.*;
public class Arrays {

    static void printArray(int []arr ){
        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);

        // System.out.println("Enter the size of array ");
        // int n=sc.nextInt();
         int []arr=new int[5];
         arr[0]=5;
         arr[1]=6;
         arr[2]=7;
         arr[3]=8;
         arr[4]=9;

        // System.out.println("Enter "+ n + "elements ");
        // for(int i=0 ; i< arr.length ;i++){
        //     arr[i]=sc.nextInt();
        // }
        
        System.out.println("Original  Array : ");
        printArray(arr);

        //trying to copy arr to arr_2
        //shallow copy 
        //array referencing 
        int[] arr_2=arr;
        System.out.println("Copied Array : ");
        printArray(arr_2);

        //changing some values of arr_2
        arr_2[0]=0;
        arr_2[1]=0;

        System.out.println("Arrays after chaning arr_2");
        printArray(arr); //original array
        printArray(arr_2); //copied array

    }
  
}
