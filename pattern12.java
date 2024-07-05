import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = n - 1;
        while (row <= 2 * n - 1) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // stars
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            // mirror
            if (row < n) {
                space--;
                star--;
            } else {
                space++;
                star++;
            }
            row++;
            System.out.println();
        }
    }
}
