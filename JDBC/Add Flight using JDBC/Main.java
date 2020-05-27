import java.util.*;
public class Main{
    
    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        Flight f1=new Flight(101,"delhi","mumbai",1,700);
        FlightManagementSystem f=new FlightManagementSystem();
        if(f.addFlight(f1))
        System.out.println("Flight details added successfully");
        else
         System.out.println("Addition not done");
        
    }
}
