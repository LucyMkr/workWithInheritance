package Shop;


public class TV extends Product {
    String screenType;
    int screenDiagonalLineInInches;
    boolean isScreenType = true;

    public TV(int costPrice, int price, int dataOfManufacture, String screenType, int screenDiagonalLine) {
        super(costPrice, price, dataOfManufacture);
        this.screenType = setScreenType(screenType);
        this.screenDiagonalLineInInches = setScreenDiagonalLineInInches(screenDiagonalLine);
    }
    @Override
    protected int setCostPrice(int costPrice) {
        if (costPrice >= 150000&& costPrice <= 1000000) {
            this.costPrice = costPrice;
        } else {
            System.exit(29);
        }
        return costPrice;
    }

    @Override
    protected int setPrice(int price) {
        if (price >= 200000 && price <= 1000000) {
            this.price = price;
        } else {
            System.exit(30);
        }
        return price;
    }

    public String setScreenType(String screenType) {
        String[] types = new String[]{"curved", "straight"};
        for (int i = 0; i < types.length; i++) {
            if (screenType == types[i]) {
                isScreenType = false;
                this.screenType = screenType;
            }
        }
        if (isScreenType) {
            System.exit(31);
        }
        return screenType;
    }

    public int setScreenDiagonalLineInInches(int screenDiagonalLineInInches) {
        if (screenDiagonalLineInInches >= 24 && screenDiagonalLineInInches <= 85) {
            this.screenDiagonalLineInInches = screenDiagonalLineInInches;
        } else {
            System.exit(32);
        }
        return screenDiagonalLineInInches;

    }
}
