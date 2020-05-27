import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        float f=sc.nextFloat();
        if(f<=0.00)
        {
            System.out.println((int)f+" is an Invalid Input");
        }
        else
        {
             System.out.println("Enter the distance covered");
            float d=sc.nextFloat();
            if(d<=0.00)
            {
             System.out.println((int)d+" is an Invalid Input");

            }
            else{
                float first=(float)((f/d)*100);
        
                float second=(float)((d*0.6214)/(f*0.2642));
                System.out.println("Liters/100KM");
                System.out.println(String.format("%.2f",first));
                System.out.println("Miles/gallons");
                System.out.println(String.format("%.2f",second));
            }
        }
    }
}
