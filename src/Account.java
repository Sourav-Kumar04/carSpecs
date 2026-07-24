
public class Account {

    int accountNumber;
    double accountBalance;

    private static double interestRate = 0.05;

    public Account(double accountBalance, int accountNumber) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }
    public Account() {

    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void addInterest() {
        accountBalance *= (1 + interestRate);
    }

    public boolean withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println(" now has a balance of " + accountBalance);
            return true;
        } else {
            System.out.println(" has insufficient funds for this withdrawal");
            return false;
        }
    }

    public boolean withdraw() {
        return withdraw(20);
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
