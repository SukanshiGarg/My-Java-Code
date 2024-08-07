//time complexity : set(O log N ) and for for loop(N)
// so TC : O (n log n )


import java.util.Arrays;  
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate1{
    public static void main(String[] args) {
        int []sortedArray ={1,1,2,3,3,4,5,5};

        //Convert the array to a tree set to remove the duplicates and maintain order
        Set<Integer> set = new TreeSet<>();
        for(int num: sortedArray){
            set.add(num);
        }

        //Convert the set back to arrays
        int []uniqueArray = new int[set.size()];
        int i=0;
        for(int num : set){
            uniqueArray[i++] = num;
            
        }
        //Print the result 
        System.out.println(Arrays.toString(uniqueArray));

        }
}
