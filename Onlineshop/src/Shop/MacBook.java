package Shop;

public class MacBook extends Laptop {
    public MacBook(int costPrice, int price, int dataOfManufacture, int RAM, int memory, String processor) {
        super(costPrice, price, dataOfManufacture, RAM, memory, processor);
        this.processor = setProcessor(processor);
    }

    @Override
    protected String setProcessor(String processor) {
        String[] processors = new String[]{"M1", "M1 Pro", "M1 Max", "M1 Ultra", "M2", "M2 Pro", "M2 Max"};
        for (int i = 0; i < processors.length; i++) {
            if (processor == processors[i]) {
                isNotProcessor = false;
                this.processor = processor;
            }
        }
        if (isNotProcessor) {
            System.exit(5);
        }
        return processor;
    }

    @Override
    protected int setCostPrice(int costPrice) {
        if (costPrice >= 700000 && costPrice <= 3000000) {
        } else {
            System.exit(6);
        }
        return costPrice;
    }

    @Override
    protected int setPrice(int price) {
        if (memory > 128 && RAM > 8 && price >= 1200000 && price <= 3000000 || memory <= 128 && RAM <= 8 && price < 1200000 && price > 600000) {
            this.price = price;
        } else {
            System.exit(7);
        }
        return price;
    }

    @Override
    public void creditSum(int monthsOfCredits) {
        super.creditSum(monthsOfCredits);
        if (monthsOfCredits == 12) {
            price = (int) (price * 1.05);
        } else if (monthsOfCredits == 24) {
            price = (int) (price * 1.1);
        } else {
            System.exit(9);
        }
    }
}

