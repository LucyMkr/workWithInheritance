package Shop;
public abstract class Cards {
    private String number;
    private String pin;
    private String cvv;
    protected int sum;
    private String name;
    private String surname;
    private int expirationYear;
    private String type;

    public Cards(String number1, String pin1, String cvv1, int sum1, String name1, String surname1, int expirationYear1) {
        number = setNumber(number1);
        pin = setPin(pin1);
        cvv = setCvv(cvv1);
        sum = setSum(sum1);
        name = setName(name1);
        surname = setSurname(surname1);
        expirationYear = setExpirationYear(expirationYear1);
    }

    private String setNumber(String number) {
        if (number.length() == 19) {
            this.number = number;
        } else {
            System.out.println("Wrong data input");
            System.exit(1);
        }
        return number;
    }

    private String setPin(String pin) {
        if (pin.length() == 4) {
            this.pin = pin;
        } else {
            System.out.println("Wrong data input");
            System.exit(2);
        }
        return pin;
    }

    private String setCvv(String cvv) {
        if (cvv.length() == 3) {
            this.cvv = cvv;
        } else {
            System.out.println("Wrong data input");
            System.exit(3);
        }
        return cvv;
    }

    private int setSum(int sum) {
        if (sum >= 0 && sum <= 10000000) {
            this.sum = sum;
        } else {
            System.out.println("Wrong data input");
            System.exit(4);
        }
        return sum;
    }

    public String setName(String name) {
        if (name.length() > 2) {
            this.name = name;
        } else {
            System.exit(10);
        }
        return name;
    }

    public String setSurname(String surname) {
        this.surname = surname;
        return surname;
    }

    public int setExpirationYear(int expirationYear) {
        if (expirationYear >= 2000 && expirationYear <= 2060)
            this.expirationYear = expirationYear;
        else {
            System.exit(11);
        }
        return expirationYear;
    }

    public String getNumber() {
        return number;
    }

    public String getPin() {
        return pin;
    }

    public String getCvv() {
        return cvv;
    }

    public int getSum() {
        return sum;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public abstract String getType();

    public int getMoney(int takenMoney) {
        if (takenMoney <= sum && takenMoney > 0) {
            sum = sum - takenMoney;
        } else {
            System.out.println("You do not have enough money");
            System.exit(5);
        }
        return sum;
    }

    public int inMoney(int inputMoney) {
        if (inputMoney > 0 && inputMoney + sum <= 10000000) {
            sum = sum + inputMoney;
        } else {
            System.out.println("You cross you limit of your card");
            System.exit(6);
        }
        return sum;
    }

    public int onlinePurchase(int takenMoney) {
        if (takenMoney <= sum && takenMoney > 0) {
            sum = sum - takenMoney;
        } else {
            System.out.println("You do not have enough money");
            System.exit(8);
        }
        return sum;
    }
}
