import java.util.*;
public class Cp_116A_Tram_Codeforces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]nums=new int[n][2];

        for(int i=0;i<n;i++){
            nums[i][0]=sc.nextInt();   //first colums -->0 index
            nums[i][1]=sc.nextInt();   // second Column --->1 index
        }
        
        int currentCap=0;
        int maxCap=0;

        for (int i = 0; i < nums.length; i++) {
            currentCap-=nums[i][0];
            currentCap+=nums[i][1];

            if(currentCap>maxCap){
                maxCap=currentCap;
            }
        }
        System.out.println(maxCap);


    }
    
}
