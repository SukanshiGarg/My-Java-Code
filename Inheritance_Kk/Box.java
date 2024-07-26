package Inheritance_Kk;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

     //square
    Box(double side){
        this.w = side;
        this.h=side;
        this.l=side;
    }

    public Box(double l,double w, double h)
{
    this.l=l;
    this.h=h;
    this.w=w;
}   
Box (Box old){
    this.h=old.h;
    this.l=old.l;
    this.w=old.w;

} 
 
public void information(){
    System.out.println("Runnung the box ");
 }
 
}
