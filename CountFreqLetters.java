public class CountFreqLetters {
    public static void main(String[] args) {
        String str="example";
        //Array to hold counts of each letter
        int []letterCounts = new int [26];

        //iterate over each character of the string 
        for(char c : str.toCharArray()){
            //incrementing the count for each corresponding letter
            
             //ensure the letter is in lowercase
             if(c>='a' && c<='z'){
                letterCounts[c-'a']++;      }
        }
        //print the count of the letter

        for(int i=0 ;i<=26;i++){
            if(letterCounts[i]>0){
                System.out.println((char)(i+'a') + ":" + letterCounts[i]);
            }
        }
    }
    
}
