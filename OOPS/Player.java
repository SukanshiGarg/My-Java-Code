//  for static variable usage 



package OOPS;

class PLayerr{

    //instance variable 

    String name;
    int id;

    //Private static variables to count players
    private static int playerCount=0;

    //Contructor to initialize a playerr object 
    PLayerr(String name){
    

        //Assign name passed in the constructor to the instance varibale 
        this.name = name;
        

        //Assign unique id to current player and increase the player count 
        id = ++playerCount;

    }

    //static method to get the total number of the players 
    static int getPlayerCount(){
        return playerCount; 
        //return the current count of the players
    }

}


//main class --> public class 
public class Player{
    public static void main(String[] args) {
        
        //Print the intial player count (should be zero)
        System.out.println(PLayerr.getPlayerCount());

        // create a new player object 
        PLayerr p1 = new PLayerr("Sukanshi  Garg");

        //print playerc count after creating one player (Should be 1 )

        System.out.println(PLayerr.getPlayerCount());

        
    }
}