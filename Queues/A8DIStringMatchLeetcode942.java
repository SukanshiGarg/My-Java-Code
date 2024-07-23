package Queues;
import java.util.*;
public class A8DIStringMatchLeetcode942{
    public static void main(String [] args){
        String s="IIDIDDD";
        System.out.println(Contruct_Smallest(s));
    }
    public static String Contruct_Smallest(String s ){
        int n=s.length();
        int [] ans = new int[n+1];
        Stack<Integer> st = new Stack<>();
        int c=1;
        for(int i=0 ; i<=n;i++){
            if(i==n || s.charAt(i)=='I'){
                ans[i]=c;
                c++;
                while(!st.isEmpty()){
                    ans[st.pop()]=c;
                    c++;
                }
            }
            else{
                st.push(i);
            }
        }
        String str="";
        for (int i = 0; i < ans.length; i++) {
            str+=ans[i];
        }
            return str;
    }

}