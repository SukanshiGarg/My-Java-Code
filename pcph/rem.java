import java.util.*;

public class rem {
    public static int sumOfdigits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans = n;
        while (ans > 9) {
            ans = sumOfdigits(ans);
        }
        System.out.println("The single digit sum is: " + ans);
    }
}
