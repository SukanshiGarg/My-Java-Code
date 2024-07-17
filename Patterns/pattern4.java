/*
n=5 (given)
rows:   1 to n
        1 to 5 


Task : spaces print krni hai 
    stars print karne hain 


//for first row : 
row=1
space=n-1
star=1

//loop ke liye 
row++;
space--;
star++;
syso();
*/

import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n= sc.nextInt();
        int row=1;
        int star=1;
        int space=n-1;
        while(row<=n){
            //spaces 
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //stars print karwayenge
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            //next row preparartion
            row++;
            space--;
            star++;
            System.out.println();

        }
        
    }
    
}
