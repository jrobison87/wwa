package menu;


public class Option {
     
    
     
    // constructor
     
    public String start() {
       System.out.print("The game is loading...\n");    
       return "The game is loading...";
    }
     
    public String load() {  
        System.out.print("The game is loading...\n"); 
        return "Load savestate ";
    }
  
   public String exit() {
        System.out.print("Exiting the game.\n"); 
        return "Exit Game ";
    }
     
                                                                                            
}