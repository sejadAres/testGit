public class Order {
    private int orderNumber;
    private ShoppingBasket basket;

    public Order(int orderNumber, ShoppingBasket basket) {
        this.orderNumber = orderNumber;
        this.basket = basket;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public ShoppingBasket getBasket() {
        return basket;
    }

    public void setBasket(ShoppingBasket basket) {
        this.basket = basket;
    }
}
