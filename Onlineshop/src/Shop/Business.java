package Shop;
public class Business extends Cards {
    private boolean isNotDone = true;

    public Business(String number1, String pin1, String cvv1, int sum1, String name1, String surname1, int expirationYear1) {
        super(number1, pin1, cvv1, sum1, name1, surname1, expirationYear1);

    }

    @Override
    public String getType() {
        return "Business";
    }

    public void duty() {
        if (isNotDone) {
            isNotDone = false;
            sum += 1000000;
        } else {
            System.out.println("You cannot add more money");
            System.exit(6);
        }
    }

    @Override
    public int onlinePurchase(int takenMoney) {
        takenMoney = (int) (takenMoney * 0.9);
        if (takenMoney <= sum && takenMoney > 0) {
            sum = sum - takenMoney;
        } else {
            System.out.println("You do not have enough money");
            System.exit(8);
        }
        return sum;
    }
    @Override
    public String toString() {
        String info = getName() + '\n' + getSurname() + '\n' + getExpirationYear() + '\n' + getType() ;
        return info;
    }

}
