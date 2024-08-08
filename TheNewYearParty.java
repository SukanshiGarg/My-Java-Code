import java.util.*;
import java.util.Arrays;
public class TheNewYearParty {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //entering three points
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();

        int points[]={x1,x2,x3};
        Arrays.sort(points);
        int median=points[1];

        //Calculate the total distance
        int totalDistance=Math.abs(points[0]-median)+




    }
    

}
