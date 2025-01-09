import java.util.ArrayList;

public class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    ArrayList<Product> products = new ArrayList<>();
    void addToCart(Product product){
        products.add(product);
    }
    void showProducts() {
        System.out.println("Name" + ": " + name);
        for (Product i : products) {
            System.out.println(i.name + " " + i.price);
        }
        System.out.println("All products" + "--" + name);
        System.out.println("========");

    }
    void remove(Product delete_product){
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).id == delete_product.id){
                products.remove(i);
            }
        }
    }

}
