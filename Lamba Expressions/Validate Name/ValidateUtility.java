import  java.util.regex.*;
import java.util.Scanner;
public class ValidateUtility
{
    public static void main(String args[])
    {
        //fill code here
        Scanner in=new Scanner(System.in);
        String empname=in.nextLine();
        String proname=in.nextLine();
        ValidateUtility vu=new ValidateUtility();
        Validate ob=vu.validateEmployeeName();
        Validate ob1=vu.validateProductName();
        boolean t1=ob.validateName(empname);
        boolean t2=ob1.validateName(proname);
        if(t1==true)
        {
            System.out.println("Employee name is valid");
        }
        else
        {
            System.out.println("Employee name is invalid");
        }
        if(t2==true)
        {
            System.out.println("Product name is valid");
        }
        else
        {
            System.out.println("Product name is invalid");
        }
        
    }
    public static Validate validateEmployeeName() 
    {
        //fill code here
        
        Validate vo1 = (name)->{
                                Matcher m = Pattern.compile("[a-zA-z\\s]{5,20}").matcher(name);
                                if(m.matches()) return true;
                                else return false;
                                };
         return vo1; 
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
                Validate vo2 = (name)->{
                                Matcher m = Pattern.compile("[a-zA-z]{1}[0-9]{5}").matcher(name);
                                if(m.matches()) return true;
                                else return false;
                                };
                return vo2; 
        
        
    }
}
