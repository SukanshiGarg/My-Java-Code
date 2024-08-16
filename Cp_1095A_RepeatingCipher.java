//repeating the cipher 
import java.util.*;

public class Cp_1095A_RepeatingCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();

        String res = "";
        int len = 1;
        int i = 0;

        while (i < n) {
            res += s.charAt(i);
            i += len;
            len++;
        }

        System.out.println(res);
        sc.close();
    }
}
