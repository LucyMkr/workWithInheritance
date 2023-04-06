package Shop;
public abstract class Laptop extends Product {
    protected int RAM;
    protected int memory;

    protected String processor;
    protected boolean isNotRAM = true;
    protected boolean isNotMemory = true;
    protected boolean isNotProcessor = true;
    protected int sumForMonth;


    Laptop(int costPrice, int price, int dataOfManufacture, int RAM, int memory, String processor) {
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
            System.exit(3);
        }
        return RAM;
    }

    private int setMemory(int memory) {
        int[] memoryArr = new int[]{128, 256, 512, 1024};
        for (int i = 0; i < memoryArr.length; i++) {
            if (memory == memoryArr[i]) {
                isNotMemory = false;
                this.memory = memory;
            }
        }if(isNotMemory){
            System.exit(4);
        }
        return memory;
    }
    public int getMonthsOfCredits() {
        return monthsOfCredits;
    }

    public int getOriginalPrice() {
        return originalPrice;
    }
    protected abstract String setProcessor(String processor);

}