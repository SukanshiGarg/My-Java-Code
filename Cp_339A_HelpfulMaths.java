import java.util.*;
import java.util.Arrays;
public class Cp_339A_HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String sym="\\+";  

        String[] parts = str.split(sym);
        int numbers[]=new int[parts.length];

        //covert string parts to integer
        for(int i=0; i<parts.length ;i++){
            numbers[i]=Integer.parseInt(parts[i]);
        }

        //sort the number
        Arrays.sort(numbers);

        //print the numbers with "+" in between
        for(int i=0;i<numbers.length;i++){
            if(i>0){
                System.out.print("+");
            }
            System.out.print(numbers[i]);
        }






        
    }
    
}
