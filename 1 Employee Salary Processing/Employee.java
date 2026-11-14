abstract class Employee
{
    private final int employeeId;
    private String employeeName;
    public  Employee(int id,String name)
    {
        if(id<1 || id>10000)
        {
            throw new IllegalArgumentException("Invalid your Employee ID");
        }
        this.employeeId=id;
        setEmployeeName(name);
       
    }

    public int getEmployeeId()
    {
        return employeeId;
    }
    public String getEmloyeeName()
    {
        return employeeName;
    }
    abstract double calculateSalary();
    public void setEmployeeName(String name)
    {
            if(name==null || name.isBlank())
            {
                throw new IllegalArgumentException("Invalid and user name will blank");
            }
            for (int i = 0; i < name.length(); i++) 
            {

                char ch = name.charAt(i);

                if (!Character.isLetter(ch)) {
                    throw new IllegalArgumentException("Name must contain only alphabets");
                }
            }
            this.employeeName=name;
            
        
    }
}