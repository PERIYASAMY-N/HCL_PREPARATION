

public class CreditCardPayment implements Payment
{
    public  double calculateFee(double amount)
    {
        return amount*2/100;
    }
   
    
}
