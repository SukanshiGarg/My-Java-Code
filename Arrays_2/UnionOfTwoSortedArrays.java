package Arrays_2;
public class UnionOfTwoSortedArrays {
    public static int[] findUnion(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        
        // Merge the arrays and keep track of union
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (k == 0 || result[k - 1] != arr1[i]) {
                    result[k++] = arr1[i];
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (k == 0 || result[k - 1] != arr2[j]) {
                    result[k++] = arr2[j];
                }
                j++;
            } else {
                if (k == 0 || result[k - 1] != arr1[i]) {
                    result[k++] = arr1[i];
                }
                i++;
                j++;
            }
        }
        
        // Add remaining elements from arr1
        while (i < n1) {
            if (k == 0 || result[k - 1] != arr1[i]) {
                result[k++] = arr1[i];
            }
            i++;
        }
        
        // Add remaining elements from arr2
        while (j < n2) {
            if (k == 0 || result[k - 1] != arr2[j]) {
                result[k++] = arr2[j];
            }
            j++;
        }
        
        // Copy the union into a new array of the correct size
        int[] union = new int[k];
        System.arraycopy(result, 0, union, 0, k);
        
        return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 7};
        int[] arr2 = {2, 3, 5, 6};
        
        int[] union = findUnion(arr1, arr2);
        
        System.out.println("Union of the two arrays: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}
