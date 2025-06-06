class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary*12;
    }

    public int raiseSalary(int percentage) {
        salary = salary * (100 + percentage) / 100;
        return salary;
    }

    public String toString() {
        return "[" + id + ", " + firstName + ", " + lastName + ", " + salary + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1);

        employee1.setSalary(999);
        System.out.println(employee1);

        System.out.println(employee1.getAnnualSalary());

        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);
    }
}
