import java.util.Arrays;

class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        return "Author[" + this.name + " " + this.email + " " + this.gender + "]";
    }
}

class Book {
    private String name;
    private Author author[];
    private double price;
    private int quantity;

    Book(String name, Author[] authors, double price) {
        this.name = name;
        this.author = authors;
        this.price = price;
        this.quantity = 0;
    }

    Book(String name, Author[] author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public Author[] getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book[" + this.name + ", " + Arrays.toString(this.author) +  ", " + this.price + ", " + this.quantity + "]";
    }
}

public class Part2 {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()
    }
}
