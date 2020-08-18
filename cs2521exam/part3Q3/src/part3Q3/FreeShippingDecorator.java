package part3Q3;

public class FreeShippingDecorator extends Decorator{
    private double price;
    private double weight;

    // TODO Complete this class
    public FreeShippingDecorator(Product product, double price, double weight) {
        super(product);
        this.price = price;
        this.weight = weight;
    }

    @Override
    public double getShippingCost() {
        if (super.getPrice() > this.price && super.getWeight() < this.weight) {
            return 0;
        }
        return super.getShippingCost();
    }
}
