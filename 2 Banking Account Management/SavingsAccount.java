class SavingsAccount extends BankAccount {
    private double intrestrate;

    SavingsAccount(int accountNumber, double balance, double intrestrate) {
        super(accountNumber, balance);
        if (intrestrate < 0.0 || intrestrate > 20.0) {
            throw new IllegalArgumentException("Invalid Intrestrate");
        }
        this.intrestrate = intrestrate;

    }

    double calculateFinalBalance() {

        return getBalance() + (getBalance() * intrestrate / 100);
    }

}
