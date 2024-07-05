public class ArraylinearSearch {
    public static void main(String[] args) {
        int arr[]={3,5,1,7,8};
        int item=71 ;
        System.out.println(Search(arr,item));
    }
    public static int Search(int arr[],int item){
        for(int i=1;i<arr.length;i++){
            if(arr[i]==item){
                return 1;
            }
        }
        return -1;

    }

}
