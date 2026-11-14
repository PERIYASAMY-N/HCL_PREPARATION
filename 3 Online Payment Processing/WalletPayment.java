

public class WalletPayment implements Payment
{
    @Override 
    public  double calculateFee(double amount)
    {
        return amount*1/100;
    }
    
}
