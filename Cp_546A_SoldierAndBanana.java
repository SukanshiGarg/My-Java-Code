import java.util.*;
public class Cp_546A_SoldierAndBanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int totalCost=0;
        int borrow=0;

        for(int i=1;i<=w;i++){
             totalCost+=k*i;
        }
        borrow=totalCost-n;
        
         // If borrow is negative, the soldier does not need to borrow money
         if (borrow < 0) {
            borrow = 0;
        }
        System.out.println(borrow);




        
    }
    
}
