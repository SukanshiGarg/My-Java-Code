package OOPS;

public class Student {
    String name;
    int age;
    
    public void Intro_yourSelf() {

        System.out.println("My name is "+ name+ " and my age is "+ age );
    }
    public void sayHey (String name){
        System.out.println(this.name+ " say hey " + name);
    }
}
