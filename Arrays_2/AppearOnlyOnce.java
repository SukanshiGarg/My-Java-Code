package Arrays_2;
import java.util.HashMap;
import java.util.Map ;
public class AppearOnlyOnce {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2};
        int ans=getSingleElement(arr);
        System.out.println(ans);
        
    }
    public static int getSingleElement(int arr[]){
      int n=arr.length;
      //declare a hashmap and hash the given array 
      HashMap<Integer,Integer>mpp= new HashMap<>();

      for(int i=0;i<n;i++){
        int value=mpp.getOrDefault(arr[i], 0);
        mpp.put(arr[i],value+1);
    }

    //find the single element and return the answer 
    for(Map.Entry<Integer,Integer> it:mpp.entrySet()){
        if(it.getValue()==1){
            return it.getKey();
        }
    }
    return -1;


    }
    
}
