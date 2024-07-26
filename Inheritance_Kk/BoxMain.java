package Inheritance_Kk;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box();

        System.out.println(box.l+ " "+ box.w+ " "+ box.h);

        Box box1 = new Box(2.0,3.0,5);

        System.out.println(box1.l+ " "+ box1.w+ " "+ box1.h);

        }
    
}
