import java.util.*;
public class Main 
{
   public static void main(String[] args)
   {
   
    System.out.println("***********************************");
    System.out.println("Welcome to our bank");
    System.out.println("***********************************");
    start();
   }




   public static void start()
   {
     Scanner ob=new Scanner(System.in);
    System.out.println("Enter your Account type");
    int type=ob.nextInt();
    if(type<1||type>2)
    {
        throw new IllegalArgumentException("Enter correct account type");
    }
    System.out.println("Enter your account number");
    int accountNumber=ob.nextInt();
    System.out.println("Enter your balance");
    double balance=ob.nextDouble();
    if(type==1)
    {
        System.out.println("Enter your intrest rate");
        double Intrestrate=ob.nextDouble();
        BankAccount bank=new CurrentAccount(accountNumber, balance, Intrestrate);
        run(bank);
    }
    else{
         System.out.println("Enter your overdraftrate");
        double overdraftrate=ob.nextDouble();
        BankAccount bank=new CurrentAccount(accountNumber, balance, overdraftrate);
        run(bank);
    }
   }
   public static void run(BankAccount bank)
   {
    System.out.println("********************* OUTPUT ******************");
    System.out.println("Balance "+bank.calculateFinalBalance());
    
   }
    
}
