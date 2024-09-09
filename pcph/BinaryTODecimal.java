import java.util.*;
public class BinaryTODecimal {
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
      int n;
      n=s.nextInt();
      int temp=n;
      int decimal=0;
      int i=0;
      while(temp>0){
        int r=temp%10;
        temp=temp/10;
        decimal=decimal+r*(int)Math.pow(2, i++);

      }
      System.out.println("THE DECIMAL no of binary "+n+" is "+decimal);

    s.close();
  }

  
}