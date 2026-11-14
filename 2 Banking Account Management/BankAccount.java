

abstract class BankAccount 
{
    private final int accountNumber;
    private double balance;

    public int getAccountNumber()
    {
        return accountNumber;

    }
    public double getBalance()
    {
        return balance;
    }

    public BankAccount(int accountNumber,double balance)
    {
        if(accountNumber<1 ||accountNumber>1000000)
        {
            throw new IllegalArgumentException("Invalid account number");
        }
        this.accountNumber=accountNumber;
        setBalance(balance);
    }
    public void setBalance(double bal)
    {
        if(bal<0.0 || bal>10000000.0)
        {
            throw new IllegalArgumentException("Invalid Balance");
        }
        this.balance=bal;
    }
      abstract double calculateFinalBalance();
    
}
