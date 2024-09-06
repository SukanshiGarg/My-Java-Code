//Intersection of the arrays
package Arrays_2;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3,5,7};
        int arr2[]={2,3,5,6};
        
        int [] intersection = findIntersection(arr1,arr2);
        
        System.out.println("Intersection of the two arrays :");
        for(int num: intersection){
            System.out.print(num+" ");
        }
        
    }
    public static int[] findIntersection(int arr1[],int arr2[]){
        //Step1: Find the length of both the arrays
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0,j=0,k=0;

        //Step2:A array to store 
        int result[]  = new int[Math.min(n1,n2)];
        
        //traverse both the arrays using two pointers
        while(i<n1 && j<n2 ){
             if(arr1[i]<arr2[j]){
               i++;
             }
             else if(arr1[i]>arr2[j]){
                j++;
             }
             else{
                // arr1[i] == arr2[j]
                if(k==0 || result[k-1]!=arr1[i]){
                    result[k++]=arr1[i];
                }
                i++;
                j++;
             }
            }

            //copy the intersection elements into a new array of correct size
            int [] intersection = new int[k];
            System.arraycopy(result, 0, intersection, 0, k);

            return intersection;
    

    }
    
}
