package instruments;

public class Piano extends Instrument{

    private String type;

    public Piano(String brand, String model, double buyingPrice, double sellingPrice, String type) {
        super(brand, model, buyingPrice, sellingPrice);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String play() {
        return "keyboardcat.gif";
    }
}
