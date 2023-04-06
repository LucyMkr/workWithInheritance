package Shop;

public abstract class Product extends Shop {
    protected static int costPrice;
    protected static int price;
    protected int dataOfManufacture;
    protected int originalPrice;

    Product(int costPrice, int price, int dataOfManufacture) {
        this.costPrice = setCostPrice(costPrice);
        this.price = setPrice(price);
        this.dataOfManufacture = setDataOfManufacture(dataOfManufacture);
        this.originalPrice = setPrice(price);
    }

    protected abstract int setCostPrice(int costPrice);

    protected abstract int setPrice(int price);

    private int setDataOfManufacture(int dataOfManufacture) {
        if (dataOfManufacture >= 2019 && dataOfManufacture <= 2023) {
            this.dataOfManufacture = dataOfManufacture;
        } else {
            System.exit(1);
        }
        return dataOfManufacture;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getPrice() {
        return price;
    }

    public int getDataOfManufacture() {
        return dataOfManufacture;
    }

    public static void purchase(Cards card) {
        if (card.getSum() >= price) {
            int profit = price - costPrice - sumOfPercent;
            allMoney += profit;
            card.sum -= price;
            System.out.println("Thank you for your recent purchase");
        } else {
            System.out.println("Transaction was rejected");
            System.exit(2);
        }

    }

    public int calculateSumOfPercent() {
        sumOfPercent = price - originalPrice;
        return sumOfPercent;
    }

    public int calculateCountSumOfPercentPerMonth() {
        sumOfPercentPerMonth = (price - originalPrice) / monthsOfCredits;
        return sumOfPercentPerMonth;
    }
    public int calculateSumOfCreditPerMonth(){
        creditPerMonth = price / monthsOfCredits;
        return creditPerMonth;
    }
}

