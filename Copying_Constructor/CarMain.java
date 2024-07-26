class Car{
    String brand;
    String colour;
    String model;
    boolean isABSPresent;
    int speed;
    // Car(){
    //     //default constructor

    // }
    Car(String brand,String model,String colour,boolean isAbs ,int speed){
        System.out.println("Init");
        this.brand=brand;
        this.model=model;
        this.colour=colour;
        isABSPresent=isAbs;
        this.speed=speed;
        System.out.println("Init done ");
    }
    Car(){
        System.out.println("This is a default : ");
        this.brand="Maruti";
        this.model="Swift";
        this.speed=80;
        this.colour="Black";
        this.isABSPresent=false;
    }
    public void Drive(){
        System.out.println("Driving is beneficial ");
    }
    public void SpeedUp(int newspeed ){
        speed= newspeed;
        System.out.println("Speed up Buddy ");
    }

}

public class CarMain {
    public static void main(String[] args) {
    // Car object ; ---> this is declaration only and not initialisation
    // no space is allocated in the heap memory 


// there is default constructor 
// agar ham khud se constructor nahi denge tab compiler apni tarf se default constructor dega
//otherwise jo apne diya hai wohi hoga

    Car object = new Car(); //object is allocated in heap memory
    System.out.println("Default speed is : "+object.speed);


    //parametrised constructor : 
    Car object2 = new Car("Ford","Ecosports","Matt Black",true, 50);
    System.out.println("Speed is : "+ object2.speed);
    


        
    }
    
}
