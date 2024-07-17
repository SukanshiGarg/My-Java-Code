package OOPS;

public class studentt {
    public static void main(String[] args) {
        Student s = new Student("Sukanshi Garg", 20);
        System.out.println(s.getAge());
        s.setAge(19);
        System.out.println(s.getAge());
        
    }
}
    
 class Student{
    private String name="Kaju";
    private int age=18;

    public Student(String name , int age ){
        this.age=age;
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name= name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}

