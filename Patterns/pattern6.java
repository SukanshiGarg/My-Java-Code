/*
ROW: 1 to n
task:spaces then stars
for row 1: row=1;
           spaces=0;
           stars=n
*/

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n= sc.nextInt();
        int row=1;
        int spaces=0;
        int stars=n;
        while(row<=n){
            //spaces
            int i=1;
            while(i<=spaces){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=stars){
                System.out.print("* ");
                j++;
            }
            //next row ki preparation
            row++;
            spaces+=2;
            stars--;
            System.out.println();
            
        }
        
    }
    
}
