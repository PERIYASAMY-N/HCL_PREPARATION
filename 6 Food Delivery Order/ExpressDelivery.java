public class ExpressDelivery extends Delivery {
    
    Delivery obj=new Delivery();
    public ExpressDelivery(double amount) 
    {
         obj.setamount(amount);
    }
    public double calculateDeliveryCharge()
    {
      return obj.getAmount()+80.0+(obj.getAmount()*5/100);  
    }
    

}
