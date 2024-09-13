import java.util.*;
public class Cp_YogurtSale {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt(); //number of test cases

        while(t --> 0){
            int n=sc.nextInt(); 
            int a =sc.nextInt();
            int b=sc.nextInt();

            //calculate the minium cost
            int cost=(n/2)*Math.min(2*a,b)+(n%2)*a;

            System.out.println(cost);
        }
    }
    
}
