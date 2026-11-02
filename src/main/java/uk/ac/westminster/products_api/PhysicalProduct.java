package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable {

    private double weightKg;
    private String dimension;

    public PhysicalProduct(){
    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimension){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimension =dimension;
    }

    public double getWeightKg(){
        return weightKg;
    }

    public String getDimension(){
        return dimension;
    }

    @Override
    public String getSummary(){
        return "Physical: " + getName() + "| Weight KG: "+ weightKg + "| Dimension" + dimension;
    }

    @Override
    public void applyDiscount(double rate) {

    }

    @Override
    public double getDiscountedPrice() {
        return 0;
    }
}


