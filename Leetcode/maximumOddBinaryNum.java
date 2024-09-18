package Leetcode;
import java.util.*;
public class maximumOddBinaryNum {
    public static String maximumodd(String s) {
        
        int countOnes=0;
        int countZeroes=0;

        //Count the number of '1's and '0's 
        for(char c: s.toCharArray()){
            if(c=='1'){
                countOnes++;
            }
            else{
                countZeroes++;
            }
        }

        //the result will have countOnes -1 followed by all the ones
        //and finally one '1 ' to ensure it's odd.

        StringBuilder result = new StringBuilder();

        //append count ones -1 '1's
        for(int i=0; i<countOnes-1;i++){
            result.append('1');
        }

        //append count zeroes '0's
        for(int i=0;i<countZeroes;i++){
            result.append('0');
        }

        //append one '1' to make it odd 
        result.append('1');

        return result.toString();
    }
    
}
