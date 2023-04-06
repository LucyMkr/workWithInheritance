package Shop;
public class Gold extends Cards {
    private int lunchSum;
    private int bonus;

    public Gold(String number1, String pin1, String cvv1, int sum1, String name1, String surname1, int expirationYear1) {
        super(number1, pin1, cvv1, sum1, name1, surname1, expirationYear1);
        lunchSum = 100000;
    }

    public int getLunchSum() {
        return lunchSum;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String getType() {
        return "Gold";
    }

    public int lunchMoney(int money) {
        if (money > 0 && money <= lunchSum) {
            lunchSum = lunchSum - money;
        } else {
            System.out.println("You do not have enough money");
            System.exit(9);
        }
        return lunchSum;
    }

    @Override
    public int getMoney(int takenMoney) {
        if (takenMoney <= sum && takenMoney > 0) {
            sum = sum - takenMoney;
            bonus += 2;
        } else {
            System.out.println("You do not have enough money");
            System.exit(5);
        }
        return sum;
    }
    @Override
    public String toString() {
        String info = getName() + '\n' + getSurname() + '\n' + getExpirationYear() + '\n' + getType() ;
        return info;
    }
}