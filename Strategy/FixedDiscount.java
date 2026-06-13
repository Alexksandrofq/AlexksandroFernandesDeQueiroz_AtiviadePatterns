package Strategy;

public class FixedDiscount implements DiscountStrategy {
    private double amount;

    public FixedDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double apply(double subtotal) {
        double result = subtotal - amount;
        return Math.max(0, result);
    }
}