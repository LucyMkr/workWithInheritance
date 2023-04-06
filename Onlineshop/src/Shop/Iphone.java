package Shop;

public class Iphone extends Phone {
    public Iphone(int costPrice, int price, int dataOfManufacture, int RAM, int memory) {
        super(costPrice, price, dataOfManufacture, RAM, memory);
    }

    @Override
    protected int setCostPrice(int costPrice) {
        if (costPrice >= 250000 && costPrice <= 1000000) {
            this.costPrice = costPrice;
        } else {
            System.exit(17);
        }
        return costPrice;
    }

    @Override
    protected int setPrice(int price) {
        if (price >= 300000 && price <= 700000 && RAM <= 8 && memory <= 256 || price >= 700000 && price <= 1200000 && RAM > 8 && memory > 256) {
            this.price = price;
        } else {
            System.exit(18);
        }
        return price;
    }


    @Override
    public void creditSum(int monthsOfCredits) {
        super.creditSum(monthsOfCredits);
        if (monthsOfCredits == 12) {
            price *= 1.05;
        } else if (monthsOfCredits == 24) {
            price *= 1.7;
        } else {
            System.exit(19);
        }

    }
}
