import java.util.Scanner;

public class Cp_791A_BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Limak's initial weight
        int b = sc.nextInt(); // Bob's initial weight
        int c = 0; // Number of years

        // Continue looping until Limak's weight becomes greater than Bob's weight
        while(a <= b) {
            a = a * 3; // Limak's weight triples each year
            b = b * 2; // Bob's weight doubles each year
            c++; // Increment the year counter
        }

        System.out.println(c); // Output the number of years
    }
}
