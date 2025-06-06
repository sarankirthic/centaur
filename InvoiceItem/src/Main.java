class InvoiceItem {
    private String id;
    private String description;
    private int quantity;
    private double unitPrice;

    public InvoiceItem(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return quantity * unitPrice;
    }

    public String toString() {
        return "[ID: " + id + " Description: " + description + " Quantity: " + quantity + " UnitPrice: " + unitPrice + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        InvoiceItem invoiceItem1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(invoiceItem1);

        invoiceItem1.setQuantity(999);

    }
}
