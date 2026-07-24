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

    public static void main(String[] args) {

//        Account account = new Account();
//        account.setAccountNumber(123456);
//        account.setAccountBalance(1000);
//
//        System.out.println("Account Number: " + account.getAccountNumber());
//        System.out.println("Account Balance: " + account.getAccountBalance());
//
//        account.withdraw(21);
//        account.withdraw();

        Account[] accounts = new Account[5];
        accounts[0] = new Account(1000.0, 1);
        accounts[1] = new Account(2000.0, 2);
        accounts[2] = new Account(1500.0, 2);
        accounts[3] = new Account(1500.0, 4);
        accounts[4] = new Account(2500.0, 5);

        Account.setInterestRate(0.07);

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Account: " + accounts[i]);
            accounts[i].addInterest();
            System.out.println("Balance after interest: " + accounts[i].getAccountBalance());
            System.out.println();
        }

        System.out.println(accounts[2].equals(accounts[3]) ? "account 2 and 3 are equal" : "account 2 and 3 are not equal");
        System.out.println(accounts[2].equals(accounts[4]) ? "account 2 and 4 are equal" : "account 2 and 4 are not equal");

        accounts[0].withdraw(100);
        accounts[1].withdraw();
        accounts[2].withdraw(2500);


        CarParts part = CarParts.ENGINE;

        if(part == CarParts.ENGINE){
            System.out.println("The part is an engine");
        } else {
            System.out.println("The part is not an engine");
        }
    }
}
