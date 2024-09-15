public class Main {
    public static void main(String[] args) {
        BankAccount balance = new BankAccount(100, "5456546545461");
        try {
            balance.deposit(50);
            balance.withdraw(200);
            balance.withdraw(50);
            balance.deposit(-10);

            }
        catch (InvalidFundException | InsufficientAmountException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("the current balance is: " + balance.getBalance());
        }
      }
    }
