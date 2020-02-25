package lesson7;

import lesson6.Order;

import java.util.Date;

public class DemoHomeWork {


    public Order createOrder(){
        Order order = new Order(100, new Date(), null, false, "Dnepr", "Ukraine", "Buy");
        return order;
    }

    public Order createOrderAndCallMethods(){
        Order order = new Order(100, new Date(), new Date(), true, "Kiev", "Ukraine", "SomeValue");
        order.checkPrice();
        order.confirmOrder();
        order.isValidType();
        return order;
    }
}
