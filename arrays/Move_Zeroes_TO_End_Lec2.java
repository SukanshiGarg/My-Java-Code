public class Move_Zeroes_TO_End_Lec2 {
    static int[] moveZeroes(int arr[]){
        //set the j pointer to find the first non zero number 
        int j=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        // no non-zeroes elements
        if(j==-1) return arr;

        //set the i pointers for swaps and rest process
        for (int i =j+1 ; i < arr.length; i++) {
            if(arr[i] !=0){
                
                //swap a[i] & a[j]
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeroes( arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
    
}
