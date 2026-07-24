import exception.DodgyNameException;

import java.util.Objects;

public class Account {

    private String name;
    private double balance;
    private AccountType accountType;

    private static double interestRate = 0.05;

    public Account(double balance, String name, AccountType accountType) throws DodgyNameException {
        setName(name);
        this.balance = balance;
        this.accountType = accountType;
    }

    public Account() {
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws DodgyNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new DodgyNameException("Account name cannot be empty");
        }
        if ("Fingers".equalsIgnoreCase(name.trim())) {
            throw new DodgyNameException("Name 'Fingers' is not allowed");
        }
        this.name = name.trim();
    }

    public double getBalance() {
        return balance;
    }

    // Backward-compatible alias for older test code.
    public double getAccountBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountBalance(double accountBalance) {
        this.balance = accountBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void addInterest() {
        balance *= (1 + interestRate);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(name + " now has a balance of " + balance);
            return true;
        } else {
            System.out.println(name + " has insufficient funds for this withdrawal");
            return false;
        }
    }

    public boolean withdraw() {
        return withdraw(20);
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accountType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account other = (Account) obj;
        return Objects.equals(name, other.name) && accountType == other.accountType;
    }
}
