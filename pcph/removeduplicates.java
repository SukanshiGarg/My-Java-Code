
import java.util.*;

//return whole array
public class removeduplicates {
    public static void main(String[] args) {
        int arr[]={0,0,1,2,2,3,4,5,5,5,6,6,6,7};
        int ans[]=reMove(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+"");
        }
        
    }
    public static int[] reMove(int ans[]){
        
        int index=0;
        for(int i=1;i<ans.length;i++){
            if(ans[i]!=ans[index]){
                index++;
                ans[index]=ans[i];
            }
        }
        return ans;

    }
}
    
