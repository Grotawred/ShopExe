import java.util.ArrayList;

public class Husband extends Human {

    private ArrayList<Product> foundGoods = new ArrayList<>();

    private ArrayList<Product> totalListOfGoods = new ArrayList<>();

    public void goShopping(ArrayList<Shop> shops) {
        for (Shop shop: shops) {
            goToShop(shop);
        }
    }

    public void goToShop(Shop shop) {
        addGoodsFromShopToTotalListOfGoods(shop);
        findNeededGoods(shop.getProduct());
    }

    public void printTotalListOfGoodsInStores() {
        for (Product product: getGoodsFromAllShops()) {
            System.out.println("Total list: \n" + product.toString());
        }
    }

    public void findNeededGoods(ArrayList<Product> list) {
        for(String product: purchaseList) {
            for (Product good: list) {
                if (product.equals(good.getName())) {
                    foundGoods.add(good);
                    break;
                }
            }
        }
    }

    public void printProducts(ArrayList<Product> list) {
        for( Product product: list) {
            System.out.println(product.toString());
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for(Product product: foundGoods) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    private void addGoodsFromShopToTotalListOfGoods(Shop shop) {
        totalListOfGoods.addAll(shop.getProduct());
    }

    public ArrayList<Product> getGoodsFromAllShops() {
        return totalListOfGoods;
    }

    public ArrayList<Product> getFoundGoods() {
        return foundGoods;
    }
}