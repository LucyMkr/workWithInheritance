package Shop;

public class ShopCard extends Cards {
    protected int count = 0;

    public ShopCard(String number1, String pin1, String cvv1, int sum1, String name1, String surname1, int expirationYear1) {
        super(number1, pin1, cvv1, sum1, name1, surname1, expirationYear1);
    }

    @Override
    public String getType() {
        return "Shop Card";
    }
    public void getCashBack(Product product){
        if(product.canUseShopCard)
            sum += (int)(product.price * 0.02);
    }

}
