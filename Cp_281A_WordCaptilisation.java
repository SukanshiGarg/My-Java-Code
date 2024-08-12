import java.util.*;
public class Cp_281A_WordCaptilisation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans=s.substring(0,1).toUpperCase() + s.substring(1);

        System.out.println(ans);


    }
    
}
