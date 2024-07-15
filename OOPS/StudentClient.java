package OOPS;

public class StudentClient {

    public static void main(String[] args) {
        Student s = new Student ();
        System.out.println(s.name);
        System.out.println(s.age);

        s.name="Sukanshi Garg";
        s.age=19;
        s.Intro_yourSelf();

        Student s1 = new Student ();
        s1.name="Priyansh Garg";
        s1.age=21;
        s1.Intro_yourSelf();
    }
    
}
