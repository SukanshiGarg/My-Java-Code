import java.util.*;
public class btod {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int placeValue=1;
        int ans=0;
        while(n!=0){
            int lastDigit=n%10;
            n/=10;
            ans+=placeValue*lastDigit;
            placeValue=2*placeValue;
        }
        System.out.println(ans);
    }
    
}
