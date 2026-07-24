import java.util.ArrayList;
import java.util.List;

public class TestAccount {
    public static void main(String[] args) {

        Account[] accounts = new Account[5];
        accounts[0] = new Account(1000.0, 1);
        accounts[1] = new Account(2000.0, 2);
        accounts[2] = new Account(1500.0, 3);
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

        // CarParts enum test
        CarParts part = CarParts.WHEELS;
        if (part == CarParts.ENGINE) {
            System.out.println("The part is an engine");
        } else {
            System.out.println("The part is not an engine");
        }

        // List usage
        List<Account> acc = new ArrayList<>();
        acc.add(accounts[0]);
        acc.add(accounts[1]);
        System.out.println("Accounts in list: " + acc);
    }
}
