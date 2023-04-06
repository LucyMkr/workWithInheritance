package Shop;

public abstract class Phone extends Product {
    protected int RAM;
    protected int memory;
    protected boolean isNotRAM = true;
    protected boolean isNotMemory = true;
    Phone(int costPrice, int price, int dataOfManufacture, int RAM, int memory) {
        super(costPrice, price, dataOfManufacture);
        this.RAM = setRAM(RAM);
        this.memory = setMemory(memory);
    }
    private  int setRAM(int RAM) {
        int[] RAMarr = new int[]{4, 8, 16, 32, 64, 128, 256, 512, 1024};
        for (int i = 0; i < RAMarr.length; i++) {
            if (RAM == RAMarr[i]) {
                isNotRAM = false;
                this.RAM = RAM;
            }
        }
        if (isNotRAM) {
            System.exit(14);
        }
        return RAM;
    }
    private int setMemory(int memory) {
        int[] memoryArr = new int[]{64, 128, 256, 512, 1024};
        for (int i = 0; i < memoryArr.length; i++) {
            if (memory == memoryArr[i]) {
                isNotMemory = false;
                this.memory = memory;
            }
        }if(isNotMemory){
            System.exit(15);
        }
        return memory;
    }
    public int getMonthsOfCredits() {
        return monthsOfCredits;
    }

    public int getOriginalPrice() {
        return originalPrice;
    }
}
