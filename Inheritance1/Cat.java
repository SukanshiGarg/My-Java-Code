package Inheritance1;

public class Cat extends Animal{
    @Override
    public void sayHello(){
        System.out.println("The cat says Meowww ");
    }

    public static void main(String[] args) {

        Cat obj = new Cat();
        obj.setName("Millie");
        obj.setAge(4);
        String name=obj.getName();
        int age=obj.getAge();
        System.out.println("The cat's name is : "+ name);
        System.out.println("The cat's age is : "+ age);
        obj.eats();
        
        obj.sayHello();

    
    }
    
}
