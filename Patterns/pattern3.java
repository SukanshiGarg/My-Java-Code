//basic right angled triangle
import java.util.*;
public class pattern3 {

    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n= sc.nextInt();
        int row=1;
        int star=1;
        while(row<=n){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
            star++;
        }

    }
    
}
