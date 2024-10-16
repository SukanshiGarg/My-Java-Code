import java.util.Scanner;
public class Employees extends Showroom implements utility{
    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    @override
    public void get_details(){
        System.out.println("ID: "+emp_id);
        System.out.println("Name: "+ emp_name);
        System.out.println("Department: "+emp_department);
        System.out.println("Showroom Name: "+ showroom_name);
    }

    @override
    public void set_details(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee details : ");
        System.out.println();
        System.out.println("EMPLOYEE NAME:" );
        System.out.println();
        System.out.println("EMPLOYEE AGE: ");
        System.out.println();
        
    }

}