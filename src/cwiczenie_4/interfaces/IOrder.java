package cwiczenie_4.interfaces;

import cwiczenie_4.models.Order;
import cwiczenie_4.models.Product;

import java.util.ArrayList;
import java.util.HashMap;

public interface IOrder {
   ArrayList<Product> getGifts();
   double getCost();
   Order getOrder();
   HashMap<String, Object> getOrderInformation();
}
