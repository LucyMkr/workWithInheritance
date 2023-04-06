package Shop;

public abstract class Shop {
    protected int monthsOfCredits;
    protected static int sumOfPercent;
    protected static int allMoney = 0;
    protected boolean canUseShopCard = false;
    protected int sumOfPercentPerMonth;
    protected int creditPerMonth;


    public void creditSum(int monthsOfCredits){
        canUseShopCard = true;
        this.monthsOfCredits = monthsOfCredits;
    }

    public int getAllMoney() {
        return allMoney;
    }
}
