public class function2 {
    public static void main(String[] args) {
        System.out.println("hello");
        int a = 7;
        int b = 11;
        System.out.println(Add(a, b));
    }

    public static int Add(int a, int b) {
        int c = a + b;
        return c - Sub(c, b);
    }

    public static int Sub(int a, int b) {
        int c = a - b;
        return c;  
    }
}
