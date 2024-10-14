import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (numRows == 0) return result;

        // Add the first row [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        // If only one row is needed, return the result
        if (numRows == 1) return result;

        // Generate Pascal's Triangle for numRows > 1
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);

            // Create the next row starting with 1
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);

            // Add the inner elements by summing the two values from the previous row
            for (int j = 0; j < i - 1; j++) {
                row.add(prevRow.get(j) + prevRow.get(j + 1));
            }

            // End the row with 1
            row.add(1);

            // Add the row to the final result
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        PascalsTriangle solution = new PascalsTriangle();
        int numRows = 5;  // You can modify this number to test with different inputs
        List<List<Integer>> pascalsTriangle = solution.generate(numRows);

        // Print Pascal's Triangle
        for (List<Integer> row : pascalsTriangle) {
            System.out.println(row);
        }
    }
}

