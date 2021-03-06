package lesson6;

import java.util.Date;

public class Order {
    long id;
    int price;
    Date dateCreated;
    Date dateConfirmed;
    boolean isConfirmed;
    String city;
    String country;
    String type;

    public Order(int price, Date dateCreated, Date dateConfirmed, boolean isConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.dateConfirmed = dateConfirmed;
        this.isConfirmed = isConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Order() {
    }

    public void confirmOrder() {
        if (!isConfirmed) {
            isConfirmed = true;
            dateConfirmed = new Date();
        }
    }

    public boolean checkPrice() {
        return price > 1000;
    }

    public boolean isValidType() {
        if (!(type == "Buy" || type == "Sale"))
            return false;
        return true;
    }
}
