package ExceptionHandling;

public class Student {

    private String name = "kaju ";
    private int age =17;

    public Student(String name , int age){
        this.age=age;
        this.name=name;
    }

    public void setAge(int age) throws Exception {
        if(age<0) throw new Exception("Bklol age -ve nahi hota");
        this.age=age;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name ){
        this.name=name;

    }
    
    public int getAge(){
        return age;
    }
}
