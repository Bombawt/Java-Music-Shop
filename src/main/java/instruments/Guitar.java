package instruments;

public class Guitar extends Instrument{

    private int numOfStrings;

    public Guitar(String brand, String model, double buyingPrice, double sellingPrice, int numOfStrings) {
        super(brand, model, buyingPrice, sellingPrice);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play() {
        return "Anyway, here's Wonderwall.";
    }
}
