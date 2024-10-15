package PracticeSet;

public class Cellphone {
    public static void main(String[] args) {
        //problem 2
        features f1=new features();
        f1.callFriend();
        f1.vibration();
        f1.ringtone();

    }
    
}

class features{
   public void ringtone(){
    System.out.println("Ringing....");
   }
   public void vibration(){
    System.out.println("Vibration....");
   }
   public void callFriend(){
    System.out.println("Calling MUKUL......")
   }
}
