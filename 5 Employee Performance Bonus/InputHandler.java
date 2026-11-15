import java.util.Scanner;
public class InputHandler 
{
    private Scanner scan;
    InputHandler( Scanner scan)
    {
        this.scan=scan;
    }


    public void start()
    {
        System.out.println("************ Welcome to Calculate Employee Performance Bonus***************");


        System.out.println("Enter employeeType (1/2)");
        int type=scan.nextInt();
        if(type<1 || type>3)
        {
            throw new IllegalArgumentException("Invalid employee Type");
        }
        System.out.println("enter name");
        String name=scan.nextLine();
        for(char ch:name.toCharArray())
        {
            if(!Character.isLetter(ch))
            {
                throw new IllegalArgumentException("enter your valid name");
            }
        }
        scan.nextLine();
        Employee obj = null;
         double bonus = 0.0;
        double totalEarnings = 0.0;

        if(type==1)
        {
            System.out.println("Enter your basic salary");
            double salary=scan.nextDouble();
            if(salary<0.0||salary>1000000.0)
            {
                throw new IllegalArgumentException("Invalid basic salary");
            }
            System.out.println("enter your rating");
            int rating =scan.nextInt();
            if(rating<1||rating>5)
            {
                throw new IllegalArgumentException("Invalid rating");
            }
            obj = new TechnicalEmployee(name,salary, rating);
           bonus = obj.calculateBonus();
           totalEarnings = salary + bonus;
        }
        else if (type == 2) {
            System.out.println("Enter your sales amount:");
            double salesAmount = scan.nextDouble();
            if (salesAmount <= 0.0 || salesAmount > 5000000.0) {
                throw new IllegalArgumentException("Invalid sales amount");
            }

            obj = new SalesEmployee(name,salesAmount);
            bonus = obj.calculateBonus();
            totalEarnings = salesAmount + bonus;
        }


        System.out.println("Employee Name: " + obj.gentName());
        System.out.printf("Bonus: %.2f%n", bonus);
        System.out.printf("Total Earnings: %.2f%n", totalEarnings);

    }
    



}
