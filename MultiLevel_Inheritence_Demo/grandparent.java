package MultiLevel_Inheritence_Demo;

public class grandparent {
    private String name;
    private int age;
    private boolean hasSuperPowers;



    grandparent(){
        System.out.println("This is the grandparent constructor ! ");
        hasSuperPowers=true;
    }

    public boolean hasSuperPowers(){
        return hasSuperPowers;
    }
    
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void getName(String name){
        this.name=name;
    }

    public void getAge(int age){
        this.age=age;
    }
    
}
