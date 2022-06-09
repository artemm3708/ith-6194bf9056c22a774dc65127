package ua.ithillel.homework.hw15;

import java.time.LocalDate;
import java.util.UUID;

public class Product {

    private UUID ID;
    private int price;
    private boolean sale;
    private String type;
    private LocalDate date;

    public Product(String type, int price) {
        this.type = type;
        this.price = price;
        this.date = LocalDate.now();
    }

    public Product(String type, int price, boolean sale) {
        this.type = type;
        this.price = price;
        this.sale = sale;
        this.date = LocalDate.now();
        this.ID = UUID.randomUUID();
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public boolean getSale() {
        return sale;
    }

    public LocalDate getDate() {
        return date;
    }

    public UUID getID() {
        return ID;
    }

    public void setSale(int sale) {
        if (this.sale) {
            this.price = (this.price - (this.price / 100 * sale));
        } else {
            System.out.println("can't apply sale");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                ", date=" + date +
                '}';
    }
}
