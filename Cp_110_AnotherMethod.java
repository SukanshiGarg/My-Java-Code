import java.util.*;
public class Cp_110_AnotherMethod {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n= sc.next(); 
        //Read the number as a string to handle large inputs

        int count=0;
        for(char c : n.toCharArray()){
            if(c=='4'|| c=='7'){
                count++;
            }
        }

        //Check if the count of lucky digits is a lucky number
        if(count == 4 || count == 7 ){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        
    }
    
}
