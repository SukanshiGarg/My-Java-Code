/*
n=5;
row: 1 to n i.e 1 to 5 
task:spaces and stars
for row 1:
row=1
spaces=n-1
star=1
loop(row<=n){
//spaces
//stars
//next row ki preparation
row++;
spaces--;
stars+2;
sysout()
}

pyramid normal 
*/

import java.util.Scanner;

public class pattern7_pyramid {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n= sc.nextInt();
        int row=1;
        int spaces=n-1;
        int star=1;
        while(row<=n){
          //spaces
          int i=1;
          while(i<=spaces){
            System.out.print("  ");
            i++;
          }
          //stars
          int j=1;
          while(j<=star){
            System.out.print("* ");
            j++;
          }
          //next row ki preparation
          row++;
          System.out.println();
          spaces--;
          star+=2;
            
        }
        
    }
}
