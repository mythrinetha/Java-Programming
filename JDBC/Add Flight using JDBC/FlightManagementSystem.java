import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Properties;
/*
private int flightId;
                private String source;
                private String destination;
                private int noOfSeats;
                private double flightFare;
*/
public class FlightManagementSystem {
    public  boolean addFlight(Flight flightObj) {
        boolean isAdded = false;
        Connection connFlight = null;
        PreparedStatement pstFlight = null;
        int status = 0;
        String sql = "INSERT INTO flight VALUES(?,?,?,?,?)";
        try{
            connFlight= DB.getConnection();
            pstFlight = connFlight.prepareStatement(sql);
            
            pstFlight.setInt(1, flightObj.getFlightId());
            pstFlight.setString(2, flightObj.getSource());
            pstFlight.setString(3, flightObj.getDestination());
            pstFlight.setInt(4, flightObj.getNoOfSeats());
            pstFlight.setDouble(5, flightObj.getFlightFare());
            
            status = pstFlight.executeUpdate();
            
            if(status == 1){
                isAdded = true;
            }
            
        }catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }catch(SQLException se){
            se.printStackTrace();
        }finally{
            if(connFlight != null){
                try{
                    connFlight.close();
                }catch(SQLException se){
                    se.printStackTrace();
                }
            }
        }
        return isAdded;
    }
}


