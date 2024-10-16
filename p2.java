public class p2 {
    public static void main(String args[]) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int num = i;
            // Print the increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(num++);
            }
            num -= 2; // Set num to one less than the last printed number in the increasing part
            // Print the decreasing numbers
            for (int j = 1; j < i; j++) {
                System.out.print(num--);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
