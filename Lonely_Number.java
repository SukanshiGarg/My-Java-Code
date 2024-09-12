import java.util.*;

public class Lonely_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

       
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find lonely numbers
        List<Integer> lonelyNumbers = new ArrayList<>();
        for (int num : arr) {
            // Check if the number appears only once and has no adjacent numbers
            if (countMap.get(num) == 1 && !countMap.containsKey(num + 1) && !countMap.containsKey(num - 1)) {
                lonelyNumbers.add(num);
            }
        }

        // Step 3: Sort lonely numbers
        Collections.sort(lonelyNumbers);

        // Step 4: Print lonely numbers
        for (int lonely : lonelyNumbers) {
            System.out.print(lonely + " ");
        }
    }
}
