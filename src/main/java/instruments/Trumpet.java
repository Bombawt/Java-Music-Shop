package instruments;

public class Trumpet extends Instrument{

    private int numOfValves;

    public Trumpet(String brand, String model, double buyingPrice, double sellingPrice, int numOfValves) {
        super(brand, model, buyingPrice, sellingPrice);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }


    public String play() {
        return "Toot!";
    }
}
