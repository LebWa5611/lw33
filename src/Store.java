import java.util.ArrayList;

public class Store {
    String shop;
    public Store(String shop){
        this.shop = shop;
    }

    ArrayList<Product> products = new ArrayList<>();
    void addProduct(Product product){
        products.add(product);

    }
    void showProducts(){
        System.out.println("Shop" + ": " + shop);
        for (Product i : products ){
            System.out.println(i.name + " " + i.price);
        }
        System.out.println("All products" + "--"  + shop);
        System.out.println("========");

    }

}
