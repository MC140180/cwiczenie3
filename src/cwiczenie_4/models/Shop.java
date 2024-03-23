package cwiczenie_4.models;

import cwiczenie_4.interfaces.IOrderSubmiter;

import java.util.ArrayList;

public class Shop implements IOrderSubmiter {
    private ArrayList<Order> placedOrders;
    private ArrayList<Order> submittedOrders;

    public Shop(){
        this.placedOrders = new ArrayList<>();
        this.submittedOrders = new ArrayList<>();
    }
    public ArrayList<Order> getPlacedOrders() {
        return placedOrders;
    }

    public void setPlacedOrders(ArrayList<Order> orders) {
        this.placedOrders = orders;
    }
    public void placeOrder(Order order) {
        this.placedOrders.add(order) ;
    }
    @Override
    public void submitOrder(Order order){
        System.out.println("You cannot submit order");
    }
    public ArrayList<Order>  getSubmittedOrders() {
        return submittedOrders;
    }
    public void addOrderToSubmitted(Order order){
        this.submittedOrders.add(order);
    }

    public Shop getShop(){
        return this;
    }
}
