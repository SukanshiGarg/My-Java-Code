import java.util.Scanner;

public class Cp_1433A_Boringapartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int digit = x % 10;
            int length = 0;
            int temp = x;

            // Calculate the number of digits in x
            while (temp > 0) {
                length++;
                temp /= 10;
            }
            
            int presses = 0;
            
            // Add all the keypresses before the current digit's series
            presses += (digit - 1) * 10;
            
            // Add the keypresses within the current digit's series
            presses += length * (length + 1) / 2;
            
            System.out.println(presses);
        }
        
        scanner.close();
    }
}
