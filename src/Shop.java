import java.util.ArrayList;

public class Shop {

    public enum ShopKind {
        FOOD, TECHNICS
    }

    public ShopKind shopKind;
    private ArrayList<Product> listOfProducts = new ArrayList<>();

    public Shop(ShopKind kind) {
        this.shopKind = kind;
    }

    public void addProduct(String name, double price) {
        listOfProducts.add(new Product(name, price));
    }

    public ArrayList<Product> getProduct() {
        return listOfProducts;
    }

    public void printProducts() {
        for(Product product: listOfProducts) {
            System.out.println(product.toString());
        }
    }
}
