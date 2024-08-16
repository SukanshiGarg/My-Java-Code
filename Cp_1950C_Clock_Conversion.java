import java.util.Scanner;
//Cp_1950C_Clock_Conversion
public class Cp_1950C_Clock_Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        scanner.nextLine(); 
        for (int i = 0; i < t; i++) {
            String time24 = scanner.nextLine();
            String[] parts = time24.split(":");
            int hours = Integer.parseInt(parts[0]);
            String minutes = parts[1];
            
            String period;
            if (hours < 12) {
                period = "AM";
            } else {
                period = "PM";
            }
            
            if (hours == 0) {
                hours = 12; 
            } else if (hours > 12) {
                hours -= 12; 
            } else if (hours == 12) {
                // Noon case, remains 12
            }
            else
            {
                //already less than 12 case remain same
            }
            String str = (hours < 10 ? "0" : "") + hours; // for 09,08,07,06 type formatting 
            System.out.println( str + ":" + minutes + " " + period);
        }
        
        scanner.close();
    }
}