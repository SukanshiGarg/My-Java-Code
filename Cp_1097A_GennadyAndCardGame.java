import java.util.*;
public class Cp_1097A_GennadyAndCardGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //reading the two lines of input 
        String s1=sc.next();
        String arr[]=new String[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.next();

        }

        //extract the rank and the suit of the card
        char tableRank=s1.charAt(0);
        char tableSuit=s1.charAt(1);

        //check each card in hand
        for(String card : arr){
            char handRank = card.charAt(0);
            char handSuit = card.charAt(1);

            if (handRank == tableRank || handSuit == tableSuit) {
                System.out.println("YES");
                return;
            }
        }
        // If no match is found
        System.out.println("NO");

    }
    
}
