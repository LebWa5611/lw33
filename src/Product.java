public class Product {
    String name;
    int price;
    int  id;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.id = (int)(Math.random() * 10000);
    }
}

