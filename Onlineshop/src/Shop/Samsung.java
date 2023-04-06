package Shop;

public class Samsung extends Phone {
    public Samsung(int costPrice, int price, int dataOfManufacture, int RAM, int memory) {
        super(costPrice, price, dataOfManufacture, RAM, memory);
    }
    @Override
    protected int setCostPrice(int costPrice) {
        if (costPrice >= 250000 && costPrice <= 1000000) {
            this.costPrice = costPrice;
        } else {
            System.exit(26);
        }
        return costPrice;
    }

    @Override
    protected int setPrice(int price) {
        if (price >= 150000 && price <= 600000 && RAM <= 8 && memory < 256 || price > 600000 && price <= 1200000 && RAM > 8 && memory >= 256) {
            this.price = price;
        } else {
            System.exit(27);
        }
        return price;
    }


    @Override
    public void creditSum(int monthsOfCredits) {
        super.creditSum(monthsOfCredits);
        if (monthsOfCredits == 12) {
            price *= 1.05;
        } else if (monthsOfCredits == 24) {
            price *= 1.1;
        } else {
            System.exit(28);
        }

    }
}
