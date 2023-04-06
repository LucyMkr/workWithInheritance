package Shop;

public class Dell extends Laptop {
    public Dell(int costPrice, int price, int dataOfManufacture, int RAM, int memory, String processor) {
        super(costPrice, price, dataOfManufacture, RAM, memory, processor);
    }

    @Override
    protected int setCostPrice(int costPrice) {
        if (costPrice >= 300000 && costPrice <= 1400000) {
            this.costPrice = costPrice;
        } else {
            System.exit(10);
        }
        return costPrice;
    }

    @Override
    protected int setPrice(int price) {
        if (memory > 128 && RAM > 8 && price >= 500000 && price <= 2000000 || memory <= 128 && RAM <= 8 && price < 500000 && price >= 300000) {
            this.price = price;
        } else {
            System.exit(11);
        }
        return price;
    }

    @Override
    public String setProcessor(String processor) {
        String[] processors = new String[]{"i3", "i5", "i7", "i9", "i12"};
        for (int i = 0; i < processors.length; i++) {
            if (processor == processors[i]) {
                isNotProcessor = false;
                this.processor = processor;
            }
        }
        return processor;
    }
    @Override
    public void creditSum(int monthsOfCredits) {
        super.creditSum(monthsOfCredits);
        if (monthsOfCredits == 12) {
            price = (int) (price * 1.2);
        } else if (monthsOfCredits == 24) {
            price = (int) (price * 1.5);
        } else {
            System.exit(13);
        }
    }
}
