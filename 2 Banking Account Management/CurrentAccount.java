public class CurrentAccount extends BankAccount
{
      private double overdraftlimit;

        CurrentAccount(int accountNumber, double balance, double overdraftlimit) {
                super(accountNumber, balance);
        if (overdraftlimit < 0.0 || overdraftlimit > 500000.0) {
            throw new IllegalArgumentException("Invalid Intrestrate");
        }
        this.overdraftlimit = overdraftlimit;

    }

    double calculateFinalBalance() {

        return getBalance() + overdraftlimit;
    }
}
