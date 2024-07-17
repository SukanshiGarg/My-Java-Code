import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n= sc.nextInt();
        int row=1;
        int star=1;
        while(row<=2*n-1){
            //star
            int i=1;
            while(i<=star){
                System.out.print("*  ");
                i++;
            }
            //mirror
            if(row<n){
                star++;
            }
            else{
                star--;
            }
            row++;
            System.out.println();
        }
        
    }
    
}
