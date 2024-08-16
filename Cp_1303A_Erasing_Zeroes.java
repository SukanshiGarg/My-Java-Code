import java.util.Scanner;

public class Cp_1303A_Erasing_Zeroes {
    public static int minZeroesToRemove(String s) {
        // Search for the first and the last occurrence of "1"
        int firstOne = s.indexOf('1'); // Returns the first index of '1'
        int lastOne = s.lastIndexOf('1'); // Returns the last index of '1'

        // If there are no '1's in the string, return 0
        if (firstOne == -1) return 0;

        // Count the number of zeros between the first and last '1'
        int countZeros = 0;
        for (int i = firstOne; i <= lastOne; i++) {
            if (s.charAt(i) == '0') {
                countZeros++;
            }
        }
        return countZeros;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline character

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            int result = minZeroesToRemove(s);
            System.out.println(result);
        }
        sc.close();
    }
}
