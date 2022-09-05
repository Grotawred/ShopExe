import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final String purchaseList[] = {"Sony", "Lenovo", "Bread", "Onion"};

        Husband husband = new Husband();
        Wife wife = new Wife(husband);
        wife.addListOfProducts(purchaseList);
        wife.giveListOfProductsToHusband();

        husband.goShopping(getListOfShopsToGo());
        wife.printInfoAboutPurchaseReceivedFromHusband();
    }

    public static ArrayList<Shop> getListOfShopsToGo() {
        ArrayList<Shop> shops = new ArrayList<>();
        Shop Elektronika = new Shop(Shop.ShopKind.TECHNICS);
        shops.add(Elektronika);
        Shop Produkst = new Shop(Shop.ShopKind.FOOD);
        shops.add(Produkst);
        addItemsToStore(Elektronika);
        addItemsToStore(Produkst);
        return shops;
    }

    public static void addItemsToStore(Shop shop) {
        switch (shop.shopKind) {

            case FOOD:
                shop.addProduct("Bread", 110.0);
                shop.addProduct("Sausage", 80.0);
                shop.addProduct("Butter", 70.0);
                shop.addProduct("Milk", 300.0);
                shop.addProduct("Potato", 40.0);
                break;

            case TECHNICS:
                shop.addProduct("Sony", 100.0);
                shop.addProduct("Samsung", 80.0);
                shop.addProduct("Sharp", 70.0);
                shop.addProduct("Apple", 300.0);
                shop.addProduct("Acer", 40.0);
                break;
        }
    }
}