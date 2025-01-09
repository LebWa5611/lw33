import java.util.concurrent.Callable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product ("Cucumber", 200);
        Product product2 = new Product ("Milk", 550);
        Product product3 = new Product ("Tomato", 120);
        Product product4 = new Product ("Salo", 100);
        Product product5 = new Product ("Bread", 80);
        Product product6 = new Product ("Fish", 635);


        Store atb = new Store("ATB");
        atb.addProduct(product1);
        atb.addProduct(product2);
        atb.addProduct(product3);
        atb.showProducts();

        Store silpo = new Store("Silpo");
        silpo.addProduct(product4);
        silpo.addProduct(product5);
        silpo.addProduct(product6);
        silpo.showProducts();

        Customer customer = new Customer("Artiom");
        customer.addToCart(product1);
        customer.showProducts();
        customer.remove(product1);
        customer.showProducts();


            }
        }

