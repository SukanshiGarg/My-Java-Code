package ByteBattle;
import java.util.*;
public class AshAndUnusualContainer {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt(); //read the number of the test cases 

      for(int i=0;i<t;i++){
        int n=sc.nextInt(); //read the value of n
        sc.nextLine();
        String s=sc.nextLine();

        if(s.contains("...")){
            System.out.println(2);
        }
        else{
            int dotCount=0;
            for(char c:s.toCharArray()){
                if(c=='.'){
                    dotCount++;
                }
            }
            System.out.println(dotCount);
        }
      }
      sc.close();

    }
    
}
