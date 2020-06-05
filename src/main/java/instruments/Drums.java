package instruments;

public class Drums extends Instrument{

    private int numOfPieces;

    public Drums(String brand, String model, double buyingPrice, double sellingPrice, int numOfPieces) {
        super(brand, model, buyingPrice, sellingPrice);
        this.numOfPieces = numOfPieces;
    }

    public int getnumOfPieces() {
        return numOfPieces;
    }

    public String play() {
        return "CadburysGorilla.gif";
    }
}
