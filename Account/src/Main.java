import java.util.List;
import java.util.ArrayList;

class Account {
    private String id;
    private String name;
    private int balance;

    static List<Account> accounts = new ArrayList<Account>();

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount < this.balance) {
            this.balance -= amount;
            return this.balance;
        }
        else {
            System.out.println("Insufficient funds");
            return this.balance;
        }
    }

    public void transferTo(Account destinationAccount, int amount) {
        if (amount < this.balance) {
            this.balance -= amount;
            destinationAccount.credit(amount);
        }
        else {
            System.out.println("Not enough money");
        }
    }

    public String toString() {
        return "[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("A101", "John Doe", 88);
        System.out.println(account1);

        Account account2 = new Account("A102", "John Doe");
        System.out.println(account2);

        account1.credit(100);
        System.out.println(account1);
        account1.debit(50);
        System.out.println(account1);
        account1.debit(500);
        System.out.println(account1);

        account1.transferTo(account2, 100);
        System.out.println(account1);
        System.out.println(account2);
    }
}
