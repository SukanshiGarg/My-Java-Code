package Leetcode;


/*
   Step 1:Sum of the bits 
   1+1=2

   Step2: Extracting the bit and the carry 
   the bit append to the result iss sum %2 which is sum%2 which gives 0 , (as 2%2 =0)
   the carry is 2/2=1'
 */
public class addBinary {
    
    public String  addBinary(String a,String b){
        StringBuilder result = new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;

        //Traverse both the strings from the rightmost digits to the left 
        while(i>=0 || j>=0){
            int sum=carry;

            //add the corresponding digit from string 'a' if its exists 
            if(i>=0){
                sum+= a.charAt(i)-'0'; //convert char to int 
                i--;

            }

            //add the corresponding digit from string 'b if it exists 
            if(j>=0){
                sum+= b.charAt(j)-'0';
                j--;
            }

            //append the current bit(sum%2) to the result
            result.append(sum%2);

            //compute the carry (sum/2)
            carry=sum/2;
        }

        if(carry!=0){
            result.append(carry);
        }


        }



    }
    

