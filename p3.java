public class p3 {
    public static void main(String[] args) {
        String s="earthproblem";
        System.out.println(longestGoddString(S));
    }
    public static int longestGoodString(String S){
        int maxLength=0;
        int currentlength=0;
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            //check if the charcter is a vowel
            if(isVowel(c)){
                currentlength++;
                maxLength=Math.max(maxLength,currentlength);
            }
            else{
                currentlength=0; //reset if a non-vowel character is found
            }
        }
        return maxLength;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
      
}
