package part3Q3;

public class DiscountDecorator extends Decorator{
    // TODO: Complete this class
    private double percentage;

    public DiscountDecorator(Product product, double percentage) {
        super(product);
        this.percentage = percentage;
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice() * (1 - percentage/100);
    }
}
