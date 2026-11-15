
public class TechnicalEmployee extends Employee
{
    private double basicSalary;
    private int rating;
    public TechnicalEmployee(String name,double salary,int rating)
    {
        super(name);
        this.basicSalary=salary;
        this.rating=rating;
        
    }


   @Override 
    public double calculateBonus()
    {
        return (basicSalary * rating * 2) / 100.0;
    }

    public double calculateBonus(double salary,int rating)
    {
        return (salary * rating * 2) / 100.0;
    }
    
}
