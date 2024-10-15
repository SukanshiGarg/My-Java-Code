package PracticeSet;

public class Square {
    public static void main(String[] args) {
        Properties p1=new Properties();
        p1.side=4;
        System.out.println(p1.area());
        System.out.println(p1.perimeter());
    }
}

class Properties{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}