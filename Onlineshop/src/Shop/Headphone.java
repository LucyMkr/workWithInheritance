package Shop;

public abstract class Headphone extends Product {
    public Headphone(int costPrice, int price, int dataOfManufacture) {
        super(costPrice, price, dataOfManufacture);
    }

    @Override
    protected int setCostPrice(int costPrice) {
        if (costPrice >= 9000 && costPrice <= 150000) {
            this.costPrice = costPrice;
        } else {
            System.exit(23);
        }
        return costPrice;
    }

    @Override
    protected int setPrice(int price) {
        if (price >= 10000 && price <= 200000) {
            this.price = price;
        } else {
            System.exit(24);
        }
        return price;
    }

}
