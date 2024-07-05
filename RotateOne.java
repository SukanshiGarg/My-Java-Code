public class RotateOne {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6, 7, 8};
        int k = 3;
        rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateONE(int a[]) {
        int last = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = last;
    }

    public static void rotate(int arr[], int k) {
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }

        for (int i = 1; i <= k; i++) {
            rotateONE(arr);
        }
    }
}
