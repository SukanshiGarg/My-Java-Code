import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        //first we create a map of all the information given to us
        //we will write the polygon name and number of faces of it 

        //creating a hasmap
        Map<String,Integer> fc = new HashMap<>();

        fc.put("Tetrahedron",4);
        fc.put("Cube",6);
        fc.put("Octahedron",8);
        fc.put("Decahedron",10);
        fc.put("Iscohedron",20);

        //Create a Scanner to read input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

         // Initialize total faces count
         int totalFaces = 0;

         // Loop through each polyhedron and add the corresponding faces to total
        for (int i = 0; i < n; i++) {
            String polyhedron = sc.nextLine().trim();
            totalFaces += fc.get(polyhedron);
        }

        // Output the total number of faces
        System.out.println(totalFaces);

        // Close the scanner
        sc.close();
        
        
    }
    
}
