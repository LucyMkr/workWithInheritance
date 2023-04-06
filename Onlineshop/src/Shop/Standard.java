package Shop;
public class Standard extends Cards {

    public Standard(String number1, String pin1, String cvv1, int sum1, String name1, String surname1, int expirationYear1) {
        super(number1, pin1, cvv1, sum1, name1, surname1, expirationYear1);
    }

    public String getType() {
        return "Standard";
    }
}