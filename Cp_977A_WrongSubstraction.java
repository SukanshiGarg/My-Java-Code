import java.util.*;
public class Cp_977A_WrongSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for (int i = 0; i <k; i++) {
            int rem=n%10;
            if(rem!=0){
                n=n-1;
            }
            if(rem == 0){
                n/=10;
            }
            

            
        }
        System.out.println(n);

    }
    
}
