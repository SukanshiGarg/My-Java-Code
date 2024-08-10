import java.util.*;
public class Cp_116A_Tram2_Codeforces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int currentCap=0;
        int maxCap=0;

        for (int i = 0; i < n; i++) {
            int leave=sc.nextInt();     //num of ppl leaving
            int enter =sc.nextInt();
            

            currentCap -= leave;
            currentCap += enter;

            if(currentCap>maxCap){
                maxCap=currentCap;
            }
        }
        System.out.println(maxCap);
    }
   


    
}
