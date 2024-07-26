class CopyCon{
    int a,b;
    CopyCon(int x, int y){ //parameterised constructor
        a=x;
        b=y;
    }
}
public class CopyConMain {
    public static void main(String[] args) {
        CopyCon obj1 = new CopyCon(5, 8);
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        CopyCon obj2 = obj1;
        System.out.println("This is the directly copied constructor");
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        

    }

}
