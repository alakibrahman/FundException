public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) throws InvalidFundException{
        if(amount <= 0.00) {
            throw new InvalidFundException("this amount is invalid");
        }
        balance = balance + amount;
    }

    public void withdraw(double amount) throws InsufficientAmountException{
        if(amount > balance) {
           throw new InsufficientAmountException("insufficient amount");
        }
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
