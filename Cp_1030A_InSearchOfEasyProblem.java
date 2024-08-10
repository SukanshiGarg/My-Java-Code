import java.util.*;
public class Cp_1030A_InSearchOfEasyProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]==1){
                System.out.println("HARD");
                System.exit(0);;
            }
            
        }
        System.out.println("EASY");

      

    }
    
}
