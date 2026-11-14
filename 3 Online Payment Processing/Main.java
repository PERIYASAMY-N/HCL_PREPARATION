import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("*********************************");
        System.out.println("welcome to online processing");
        System.out.println("*********************************");




        Scanner ob=new Scanner(System.in);
        System.out.println("Enter your account typer");
        int acctype=ob.nextInt();
        if(acctype<1 || acctype>3)
        {
            throw new IllegalArgumentException("enter your correct account type");
        }
        System.out.println("Enter your Balance");
        double paymentAmount=ob.nextDouble();
        if(paymentAmount<0.0 || paymentAmount>1000000.0)
        {
            throw new IllegalArgumentException("Enter valid amount");
        }
        Main obj=new Main();
        obj.start(acctype,paymentAmount);
       
        ob.close();
    }
    private Payment pay;
    public   void start(int acctype,double paymentAmount)
    {
        if(acctype==1)
        {
             pay=new CreditCardPayment();
        }
        else if(acctype==2)
        {
            pay=new UpiPayment();
        }
        else
        {
            pay=new WalletPayment();
        }

        double tranctionfee=pay.calculateFee(paymentAmount);
        double finalAmount=paymentAmount+tranctionfee;
        System.out.println("***OUTPUT***");
        System.out.println("Payment Amount  "+paymentAmount);
        System.out.printf("Transaction Fee: %.2f",tranctionfee);
        System.out.printf("Final Amount: %.2f",finalAmount);

    }
    
}
