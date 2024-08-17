import java.util.*;
public class Cp_118A_StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] vowel="AOYEUI".toCharArray(); //character array
        String ans="";
        
        String s=sc.nextLine().toUpperCase();

        for(int i=0;i<s.length();i++){
             char c=s.charAt(i);
             boolean flag=false;
            for(int j=0;j<vowel.length;j++){
                if(c==vowel[j]){
                    flag=true;
                    break;
                }
                
            }
            if(flag){
                continue;

            }
            ans += "." + Character.toLowerCase(c);

            

            
        }
            System.out.println(ans);


        
    }
}
