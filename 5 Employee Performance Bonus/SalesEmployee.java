public class SalesEmployee extends Employee
{
    private double salesAmount;
  
      public SalesEmployee(String name, double salary) {
        super(name);
        this.salesAmount=salary;

    }
    public double calculateBonus()
    {
        return (salesAmount*3)/100;
    }
    public double calculateBonus(double amount)
    {
        return (amount*3)/100;
    }


    
}
