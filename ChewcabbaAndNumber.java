import java.util.*;

public class ChecabbaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String ans = "";
        
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (c == '9' && i == 0) {
                ans += "" + c; // Keep the first '9' as is
            } else if (c < '5') {
                ans += "" + c; // Keep digits less than '5' as is
            } else {
                ans += "" + (char) ('9' - c + '0'); // Transform digits '5' to '9'
            }
        }
        
        System.out.println(ans); // Output the transformed number
    }
}
