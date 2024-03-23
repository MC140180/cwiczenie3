package cwiczenie_4.interfaces;

import cwiczenie_4.models.Shop;

public interface IOrderSubmiter {
    void submitOrder(IGiftAssigner order);

    Shop getShop();
}
