/*
rows: 1 to n 
for row 1:
row=1
space=0
star=2n-1

loop(row<=n){
//space
//stars
//next row ki preparation
row++
stars-2 *****************                   STAR = STAR-2           ****************************
spaces++
syout()

}
 
 */

import java.util.Scanner;

public class pattern8revpyramd {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n= sc.nextInt();
        int row=1;
        int space=0;
        int star=2*n-1;
        while(row<=n){
            int i=1;
            //spaces
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //stars
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            //next rows ki prep
            row++;
            
            space++;
            star-=2;
            System.out.println();
        }
        
    }
    
}
