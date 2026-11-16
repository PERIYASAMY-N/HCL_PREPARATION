import java.util.*;
public class InputHandler 
{
    private Scanner scan;
    InputHandler(Scanner scan)
    {
        this.scan=scan;
    }
    Delivery obj=null;
    int type;
    double amount;
    public void start()
    {
        System.out.println("***********Welcome to oder to delivery calculation*************");

        System.out.println("Enter your delivery type (1/2)");
         type=scan.nextInt();
        if(type<1||type>2)
        {
            throw new IllegalArgumentException("Invalid delivery type");
        }

        System.out.println("Enter your order amount");
         amount=scan.nextDouble();
        if(amount<0.0||amount>500000.0)
        {
            throw new IllegalArgumentException("Enter your valid order amount");
        }
        run();
    }
    public void run()
    {
        if(type==1)
        {
            obj=new RegularDelivery(amount);
            System.out.println("the total amount "+obj.calculateDeliveryCharge());
        }
        else{
            obj=new ExpressDelivery(amount);
            System.out.println("the total amount "+obj.calculateDeliveryCharge());
        }
        

    }
}
