import Shop.*;

public class Main {
    public static void main(String[] args) {
        Laptop Macbook1 = new MacBook(800000, 1000000, 2020, 16, 512, "M2 Max");
        Business card1 = new Business("1547 3584 5415 1546", "1547", "541", 8000000, "Lala", "Mirzoyan", 2055);
        Gold card2 = new Gold("1547 3584 5415 1546", "1547", "541", 8000000, "Lala", "Mirzoyan", 2055);
        ShopCard card3 = new ShopCard("1547 3584 5415 1546", "1547", "541", 0, "Lala", "Mirzoyan", 2055);
        Macbook1.creditSum(12);
        Macbook1.purchase(card2);
        System.out.println("profit of shop is " + Macbook1.getAllMoney());
        System.out.println("Money of percent is " + Macbook1.calculateSumOfPercent());
        System.out.println("money of percent per month is " + Macbook1.calculateCountSumOfPercentPerMonth());
        System.out.println("..................................");
        Phone iphone1 = new Iphone(500000, 600000, 2020, 32, 64);
        iphone1.creditSum(12);
        iphone1.purchase(card2);
        card3.getCashBack(iphone1);
        System.out.println("In your shop card you have " + card3.getSum());
        System.out.println("profit of shop is " + iphone1.getAllMoney());
        System.out.println("price of the phone after the credit is " + iphone1.getPrice());
        System.out.println("You should pay " + iphone1.calculateSumOfCreditPerMonth() + " per month");
        System.out.println("Money of percent is " + iphone1.calculateSumOfPercent());
        System.out.println("money of percent per month is " + iphone1.calculateCountSumOfPercentPerMonth());
        System.out.println("..................................");
        WirelessHeadphone headphone = new WirelessHeadphone(20000, 30000, 2021, "in-ear", "Maximum");
        headphone.purchase(card1);
        System.out.println("profit of shop is " + headphone.getAllMoney());
        System.out.println(".................................");
        TV tv1 = new TV(400000, 450000, 2022, "curved", 50);
        tv1.purchase(card1);
        Laptop dell1 = new Dell(300000, 350000, 2020, 8, 256, "i5");
        dell1.purchase(card2);
        Phone samsung1 = new Samsung(500000, 600000, 2020, 32, 128);
        card3.getCashBack(samsung1);
        System.out.println("After using shop card price of your device is still " + samsung1.getPrice() + ", because it is working only for credit purchases");
        System.out.println("The final profit of shop is " + samsung1.getAllMoney());
    }
}