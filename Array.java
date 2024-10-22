import java.util.Scanner;

public class Array {
    class Box {
        String name;
        String author;
        int id;
        int quantity;

        public String toString() {
            return this.name + " " + this.author + " " + this.id + " " + this.quantity;
        }
    }

    public void sol() {
        Scanner sc = new Scanner(System.in); // Scanner initialization
        Box[] books = new Box[5]; // Capitalized 'Box'
        
        for (int i = 0; i < books.length; i++) {
            String bname = sc.next(); // Book name
            String aname = sc.next(); // Author name
            int quan = sc.nextInt();  // Quantity
            int id = sc.nextInt();    // ID

            Box b = new Box();  // Capitalized 'Box'
            b.name = bname;     // Corrected 'bname'
            b.author = aname;   // Assigning author
            b.id = id;
            b.quantity = quan;
            books[i] = b;       // Corrected array access to [i]
        }

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]); // Corrected array access to [i]
        }
        
        sc.close(); // Closing the scanner to prevent resource leak
    }

    public static void main(String[] args) {
        Array a = new Array();
        a.sol();
    }
}


