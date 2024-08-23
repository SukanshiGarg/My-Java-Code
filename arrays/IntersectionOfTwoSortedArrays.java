import java.util.*;


public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
       //for the intersection of two sorted arrays
       //take two sorted arrays
       int nums1[]={1,2,2,3,4};
       int nums2[]={2,2,3,5};

       int result[]= intersect(nums1,nums2);

       System.out.println("Intersection of the two sorted arrays ");
       for(int num : result){
        System.out.print(num + " ");
       }
    }
    public static int[] intersect(int nums1[], int nums2[]){
        List<Integer> intersection = new ArrayList<>();
        int i=0,j=0;

        //use two pointers to traverse both the arrays
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                //if the elements are same , add to result and move both pointers
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }

        //convert the list to arrays
        return intersection.stream().mapToInt(Integer::intValue).toArray();

    }
}
