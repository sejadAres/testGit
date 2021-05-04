public class Product {
    private int price;
    private String name;
    private int productnumber;

    public Product(int price, String name, int productnumber) {
        this.price = price;
        this.name = name;
        this.productnumber = productnumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductnumber() {
        return productnumber;
    }

    public void setProductnumber(int productnumber) {
        this.productnumber = productnumber;
    }
}
