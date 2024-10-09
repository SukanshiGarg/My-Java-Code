import java.util.Scanner;

public class CoverInWater {
    public static int minActions(String s, int n) {  // Specify return type as int
        int actions = 0;
        int i = 0;

        while (i < n) {
            if (s.charAt(i) == '.') {  // Use charAt and compare with '.'
                actions++;
                i += 3;  // Skip the next two cells
            } else {
                i++;  // Move to the next cell
            }
        }
        return actions;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(minActions(s, n));
        }
        sc.close();
    }
}
