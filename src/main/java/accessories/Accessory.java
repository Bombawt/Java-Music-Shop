package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    private double buyingPrice;
    private double sellingPrice;

    public Accessory(double buyingPrice, double sellingPrice) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkup(){
        return buyingPrice -= sellingPrice;
    }
}
