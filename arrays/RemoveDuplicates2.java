//Count the unique elements in the array using two pointer approach

public class RemoveDuplicates2{
    public static void main(String[] args) {
        int arr[]={1,2,2,4,4,5};
        int i=0;
        for(int j=1; j<arr.length ;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }

        }
        System.out.println(i+1);
    }
}
