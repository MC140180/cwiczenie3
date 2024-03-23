package cwiczenie_4.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
    private ArrayList<Order> placedOrders;
    private ArrayList<Order> submittedOrders;

    private final HashMap<String, Client> clients;

    public Shop() {
        this.placedOrders = new ArrayList<>();
        this.submittedOrders = new ArrayList<>();
        this.clients = new HashMap<>();
    }

    public void addClient(Client client) {
        this.clients.put(client.getClientName(), client);
    }

    public HashMap<String, Client> getClients() {
        return this.clients;
    }

    public Client getClientByName(String clientName) {
        return this.getClients().get(clientName);
    }

    public ArrayList<Order> getPlacedOrders() {
        return placedOrders;
    }

    public void setPlacedOrders(ArrayList<Order> orders) {
        this.placedOrders = orders;
    }

    public void addPlacedOrder(Order order) {
        this.placedOrders.add(order);
    }

    public ArrayList<Order> getSubmittedOrders() {
        return submittedOrders;
    }

    public void setSubmittedOrders(ArrayList<Order> submittedOrders) {
        this.submittedOrders = submittedOrders;
    }

    public void addOrderToSubmitted(Order order) {
        this.submittedOrders.add(order);
    }
}
