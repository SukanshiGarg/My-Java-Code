import java.util.Scanner;

public class inaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        String binaryStr = s.nextLine();  // Read input as a binary string
        
        // Convert binary to decimal
        int decimal = binaryToDecimal(binaryStr);
        System.out.println("The decimal equivalent of binary " + binaryStr + " is: " + decimal);
        
        s.close();
    }

    // Method to convert binary string to decimal
    public static int binaryToDecimal(String binaryStr) {
        int decimal = 0;
        int base = 1;  // 2^0

        // Traverse the binary string from right to left
        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            if (binaryStr.charAt(i) == '1') {
                decimal += base;  // Add the corresponding base value if bit is '1'
            }
            base *= 2;  // Move to the next power of 2
        }

        return decimal;
    }
}
