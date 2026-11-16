public class RegularDelivery extends Delivery {

    Delivery obj=new Delivery();
    public RegularDelivery(double amount) 
    {
        obj.setamount(amount);
    
    }
    public double calculateDeliveryCharge()
    {
      return obj.getAmount()+40.0;  
    }
    

}
