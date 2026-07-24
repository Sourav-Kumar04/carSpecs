import exception.DodgyNameException;

public class TestAccount2 {
    public static void main(String[] args) {
        Account[] accounts = new Account[5];

        accounts[0] = createAccount(1000.0, "Fingers", AccountType.CHECKING);
        accounts[1] = createAccount(2000.0, "Bob", AccountType.CHECKING);
        accounts[2] = createAccount(1500.0, "Charlie", AccountType.SAVING);
        accounts[3] = createAccount(1500.0, "Charlie", AccountType.SAVING);
        accounts[4] = createAccount(2500.0, "Eve", AccountType.CREDIT_CARD);

        Account.setInterestRate(0.07);

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                continue;
            }
            System.out.println("Account: " + accounts[i]);
            accounts[i].addInterest();
            System.out.println("Balance after interest: " + accounts[i].getBalance());
            System.out.println();
        }
    }

    private static Account createAccount(double balance, String name, AccountType type) {
        try {
            return new Account(balance, name, type);
        } catch (DodgyNameException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
