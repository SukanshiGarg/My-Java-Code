/*
 *****
  ****
   ***
    **
     *

N=5
ROW: N TO 1
     5 TO 1

INT ROW=1;
INT SPACES=0;
INT STARS=N

LOOP(ROW KE LIYE )
//SPACES
//STARS
//NEXT ROW KI PREP
ROW++;
SPACES++;
STARS--;
*/

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n= sc.nextInt();
        int row=1;
        int stars=n;
        int space=0;

        while(row<=n){
            //spaces
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //spaces
            int j=1;
            while(j<=stars){
                System.out.print("* ");
                j++;
            }
            //next row ki prep 
            row++;
            space++;
            stars--;
            System.out.println();


        }
    }
    
}
