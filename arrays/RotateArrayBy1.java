/*\
 * To rotate the array by one place : 
 */
public class RotateArrayBy1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
         //store the first term in an temporary variable 
         int temp=arr[0];
         //start a for loop and store all the leading 
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
    
}
