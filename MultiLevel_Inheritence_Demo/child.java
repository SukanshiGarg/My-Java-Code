package MultiLevel_Inheritence_Demo;

public class child extends parent{

    public child(){
        super(); 
        //calls the constructor of the immediate parent class 
        // in this case the parent class is called 
        System.out.println("This is the child constructor !");
    }
    
}
