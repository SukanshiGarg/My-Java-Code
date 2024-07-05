public class function1 {
    public static void main(String[] args) {
        System.out.println("hello");
        Add();
        System.out.println("bye");
    }
    public static void Add(){
        int a=9;
        int b=9;
        int c=a+b;
        int x=Sub();
        System.out.println(c+x);
    }
    public static int Sub()
{
    int a=9;
    int b=7;
    int c=a-b;
    return c;
}    
}
