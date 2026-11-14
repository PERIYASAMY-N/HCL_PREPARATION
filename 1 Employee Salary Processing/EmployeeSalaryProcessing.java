import java.util.Scanner;
public class EmployeeSalaryProcessing
{
    
    public static void main(String[] args)
    {
        
        Scanner ob=new Scanner(System.in);
        
        
        System.out.println("Enter your Employee Type (1/2) ");
        int EmployeeType=ob.nextInt();
        if(EmployeeType<1||EmployeeType>2)
        {
            throw new IllegalArgumentException("Enter the correct employee type");
        }
        System.out.println("Enter your Employee ID :");
        int employeeId=ob.nextInt();
        ob.nextLine();
        System.out.println("Enter your name");
        String employeeName=ob.nextLine();
         Employee employee = createEmployee(ob, EmployeeType, employeeId, employeeName);
        start(employee);
ob.close();

      
        
    }
    public static Employee createEmployee(Scanner ob, int EmployeeType, int employeeId, String employeeName)
    {
       
        Employee employee;
        if(EmployeeType==1)
        {
            
            System.out.println("Enter your monthly salary");
             double monthlySalary = ob.nextDouble();
            employee = new FullTimeEmployee(employeeId, employeeName, monthlySalary);
           
        }
         else{
            System.out.println("enter your no of days");
            int workingDays = ob.nextInt();
            System.out.println("Enter daily rate : ");
            double dailyRate =ob.nextDouble();
            employee = new ContractEmployee(employeeId, employeeName, workingDays, dailyRate);
         }
        
        return employee;
    }
    public static void start(Employee employee)
    {
        System.out.println("Employee created successfully");
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmloyeeName());
        System.out.printf("Salary: %.2f%n" , employee.calculateSalary());
    }
}
