class Customer {
    private int id;
    private String name;
    private char gender;

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "[" + name + "(" + id + ")" + "]";
    }
}

class Account {
    private int id;
    private Customer customer;
    private double balance;

    Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0D;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account[" + customer.getName() + "(" + customer.getId() + ") Balance=" + String.format("%.2f", balance) + "]";
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        balance = balance + amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return this;
        } else {
            System.out.println("Insufficient funds!");
            return this;
        }
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
