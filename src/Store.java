import java.util.ArrayList;

public class Store {
    String shop;

    public Store(String shop){
        this.shop = shop;
    }

    ArrayList<Product> products = new ArrayList<>();//products (список продуктів у магазині, тип List<Product>).
    void addProduct(Product product){
        products.add(product);// додає продукт до магазину;

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

