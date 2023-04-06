package Shop;
public class WirelessHeadphone extends Headphone {
    String powerOfCharge;
    String formFactor;
    boolean isNotFormFactor = true;
    boolean isNotPower = true;
    public WirelessHeadphone(int costPrice, int price, int dataOfManufacture, String formFactor, String powerOfCharge) {
        super(costPrice, price, dataOfManufacture);
        this.formFactor = setFormFactor(formFactor);
        this.powerOfCharge = setPowerOfCharge(powerOfCharge);
    }
    public String setFormFactor(String formFactor) {
        String[] allFormFactors = new String[]{"over-ear", "on-ear", "in-ear"};
        for (int i = 0; i < allFormFactors.length; i++) {
            if (formFactor == allFormFactors[i]) {
                isNotFormFactor = false;
                this.formFactor = formFactor;
            }
        }
        if (isNotFormFactor) {
            System.exit(25);
        }
        return formFactor;
    }

    public String setPowerOfCharge(String powerOfCharge) {
        String[] powerTypes = new String[]{"Maximum", "Medium", "Minimum"};
        for (int i = 0; i < powerTypes.length; i++) {
            if (powerOfCharge == powerTypes[i]){
                isNotPower = false;
                this.powerOfCharge = powerOfCharge;
            }
        }
        if (isNotPower){
            System.exit(26);
        }
        return powerOfCharge;
    }

    @Override
    protected int setCostPrice(int costPrice) {
        if (costPrice >= 10000 && costPrice <= 300000) {
            this.costPrice = costPrice;
        } else {
            System.exit(27);
        }
        return costPrice;
    }

    @Override
    protected int setPrice(int price) {
        if (price >= 10000 && price <= 200000) {
            this.price = price;
        } else {
            System.exit(28);
        }
        return price;
    }
}
