
class ContractEmployee extends Employee
{
    private int workingDays;
    private double dailyRate;
    public ContractEmployee(int employeeId,String employeeName,int days,double rate)
    {
        super(employeeId, employeeName);
        if(days<1||days>31)
        {
            throw new IllegalArgumentException("Invalid days");
        }
        this.workingDays=days;
        if(rate<0.0 || rate>100000.0)
        {
            throw new IllegalArgumentException("Invald Daily Rate");
        }
        this.dailyRate=rate;

    }
    private double salary;
    @Override 
    double calculateSalary()
    {
         salary=workingDays*dailyRate;
         return salary;
    }

}