package lesson10;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice,
                            Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        if ((getShipFromCity() == "Киев" || getShipFromCity() == "Одесса" || getShipFromCity() == "Днепр" ||
                getShipFromCity() == "Харьков") && (getShipToCity() == "Киев" || getShipToCity() == "Одесса" ||
                getShipToCity() == "Днепр" || getShipToCity() == "Харьков") && getBasePrice() >= 100
                && getCustomerOwned().getGender() == "Женский") {
            setDateConfirmed(new Date());
        }
    }

    @Override
    public void calculatePrice() {
        double delivery = 0;
        double discount = 0;

        if (getShipToCity() == "Киев" || getShipToCity() == "Одесса") {
            delivery = getBasePrice() * 0.1;
        } else {
            delivery = getBasePrice() * 0.15;
        }

        if (getBasePrice() > 1000) {
            discount = (getBasePrice() + delivery) * 0.5;
        }
        setTotalPrice(getBasePrice() + delivery + discount);
    }
}

