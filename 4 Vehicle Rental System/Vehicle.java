import java.util.HashMap;
public abstract class Vehicle 
{
    double dailyRate;
    Vehicle(double dailyRate)
    {
        this.dailyRate=dailyRate;
    }
     double calculateRentalCharge(int rentalDays)
     {
        return dailyRate*rentalDays;
     }
  

     abstract String getVehicleType();
    
  
}
