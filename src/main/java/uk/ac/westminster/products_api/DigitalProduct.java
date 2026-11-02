package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {

    private String downloadUrl;
    private double fileSizeMB;

    //no-arg constructure - Jackson need this to build
    //an object from an incoming JSON request body
    public DigitalProduct(){
    }

    public DigitalProduct ( Long id, String name, double price, String downloadUrl, double fileSizeMB){
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
        this.discountedPrice = price;

    }

    public String getDownloadUrl(){
        return downloadUrl;
    }

    public double getFileSizeMB(){
        return fileSizeMB;
    }

    @Override
    public String getSummary(){
        return "Digital: " + getName() + "| Download "+ downloadUrl;
    }

    @Override
    public void applyDiscount(double rate) {
        this.discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return 0;
    }
}
