package PracticeSet;
public class Employee {
    public static void main(String[] args) {
        //problem 1:
        Employee1 harry = new Employee1();
        harry.setName("CodeWIthHarry");
        harry.salary=322;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

    }
    
}
class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name=n;
    }



}
