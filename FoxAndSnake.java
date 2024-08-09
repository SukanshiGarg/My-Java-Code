import java.util.*;
public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        
        String a="";
        String b="";

        for(int i=0;i<m-1;i++){             // one less the numbeer of last index to match the number 0f dotes 
                                            // String a=#########
                                            //String b=........
            a+="#";
            b+=".";

            
        }

        a+="#";     //the remaining #
        boolean flag=true; 
        for(int i=0;i<n;i++){
            if(i%2==0){                        //for even number of rows print #
                System.out.println(a); 
            }

            //for the odd number of the rows : alternate times mai true /false khud ho jayengi 
            else{
                if(flag){
                    System.out.println(b+"#");
                    flag=!flag;
                }
                else{
                    System.out.println("#"+b);
                    flag=!flag;
                }
               
            }
        }

        
    }
    
}
