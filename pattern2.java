//solid box pattern
import java.util.*;
public class pattern2 {
    public static void main(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n=sc.nextInt();
    int row=1;
    int star=n;
    while(row<=n){
        int i=1;
        while(i<=star){
            System.out.print("* ");
            i++;
        }
        // next row ki preparation
        row++;
        System.out.println();
    }
  
   }
}
