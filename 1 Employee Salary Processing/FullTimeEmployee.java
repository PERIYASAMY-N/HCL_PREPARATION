
class FullTimeEmployee extends Employee
{
      private double monthlySalary;
      public FullTimeEmployee(int employeeId,String employeeName,double salary)
      {
        super(employeeId, employeeName);
        if(salary<0.0 || salary>1000000.0)
        {
            throw new IllegalArgumentException("Invalid salary");
        }
        this.monthlySalary=salary;
        
      }
      @Override 
     double calculateSalary()
      {
        return monthlySalary;
      }
}