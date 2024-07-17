package ExceptionHandling;

public class Student_Client {
    public static void main(String[] args) throws Exception {
        
        Student s= new Student("Sukanshi Garg",20);
        System.out.println(s.getAge());
        s.setAge(-9);
        System.out.println(s.getAge());
        System.out.println("Hey");
    }
    
}
