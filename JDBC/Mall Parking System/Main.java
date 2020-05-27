import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
public class Main {

public static void main(String [] args) {
   Scanner sc=new Scanner(System.in);
  
    
   String c="29/10/2019 20:10";

                                
                                Date din = null;
                                Date dout = null;
   SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
   format.setLenient(false);
      try {
          String dateStart=null,dateStop=null;
            Date cd=format.parse(c);
                 try
                         {    System.out.println("In-time");
                dateStart = sc.nextLine();
                              din = format.parse(dateStart);
                              long d1 = cd.getTime() - din.getTime();
                             // System.out.println(d1);
                      d1 = d1/ 60000;
                     // System.out.println(d1);
                      if(d1<1 )  
                      {
                           System.out.println(dateStart+" is an Invalid In-Time");System.exit(0);
                      }
                    
                    }
                   
                    catch (ParseException e)
                    {
                        System.out.println(dateStart+" is an Invalid In-Time");
                       System.exit(0);
                    }
                    
               try
                    {     System.out.println("Out-time");
                                      dateStop =sc.nextLine();
                          dout = format.parse(dateStop);
                    
                    }
                  
                    catch (ParseException m)
                    {
                        System.out.println(dateStop+" is an Invalid Out-Time");
                      System.exit(0);
                    }          
                                                
               long diffin = cd.getTime() - din.getTime();
      diffin = diffin/ 60000;
               /*           long diff2 = cd.getTime() - d2.getTime();

            long diffmin2 = diff2 / 60000;*/
               long diffout = dout.getTime() - din.getTime();
      
       diffout = diffout / 60000;
     //System.out.println(diffmin3);
     if(diffin>1 )    
               {
                   if(diffout>1)
                   {
                     long x=diffout/60;long y=diffout%60;
                                    if(y<60)y=y/y;
                
                                                System.out.print(x*10+(y%60)*10 +" Rupees");
                   }
                    else
                 System.out.println(dateStop+" is an Invalid Out-Time");
       
                   
               }
                else
                 System.out.println(dateStart+" is an Invalid In-Time");
       
                   
                                               } catch (Exception e) {
                
                                }   
                  
      
}
}


