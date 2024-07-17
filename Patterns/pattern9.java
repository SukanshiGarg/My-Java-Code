//pyramid with exclamations
//question 12 
import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n= sc.nextInt();
        int row=1;
        int space=n-1;
        int star=1;
        while(row<=n){
            //spaces
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            while(j<=star){
                if(j%2!=0)
                System.out.print("* ");
                else
                System.err.print("! ");
                j++;
            }
            //next row ki preparation
            row++;
           
            space--;
            star+=2;
            System.out.println();
        }

        
    }
    
}
