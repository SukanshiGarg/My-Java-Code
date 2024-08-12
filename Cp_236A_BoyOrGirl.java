import java.util.*;
public class Cp_236A_BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name=sc.nextLine();

        //use a set to store distict characters
        Set<Character> distictChars = new HashSet <>();

        //iterate through each character in the username and add it to the Set 

        for( char c: name.toCharArray()){
            distictChars.add(c);
        }

        //check if the number of distinct charcters is even or odd
        if(distictChars.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
        
    }
    
}
