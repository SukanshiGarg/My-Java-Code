package oopsjava;

public class oops1 {
    String name; // instance varibles or global variables
    int roll_no;

    public void printdata() { // Functions
        System.out.println(name);
        System.out.println(roll_no);
    }

    public static void main(String[] args) {
        oops1 std1 = new oops1();
        std1.name = "Rama";
        std1.roll_no = 45;
        std1.printdata();

        oops1 std2 = new oops1();
        std2.name="Sukanshi Garg";
        std2.roll_no=68;
        std2.printdata();
    }

}
