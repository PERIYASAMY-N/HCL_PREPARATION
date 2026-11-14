import java.util.Scanner ;
public class InputHandler 
{
    private Scanner scan;
    InputHandler(Scanner scan)
    {
        this.scan=scan;
    }
    private Vehicle vehicle;
    public void start()
    {
        System.out.println("Enter your bike type");
        int type=scan.nextInt();
        System.out.println("enter you days");
        int days=scan.nextInt();
        if(type==1)
        {
            vehicle=new Car();

        }
        else if(type==2)
        {
            vehicle=new Bike();
        }
        else{
            vehicle=new Truck();
        }


        System.out.println("Vehicle type  "+vehicle.getVehicleType());
        System.out.println("Rental Feea "+vehicle. calculateRentalCharge(days));
    }


    
}
