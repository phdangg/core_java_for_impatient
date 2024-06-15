package Chapter4;
import java.util.Objects;

public class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;

        // If otherObject is exactly an Item but not a DiscountedItem
        if (otherObject.getClass() == Item.class) return true;

        // If otherObject is a DiscountedItem, compare the discount
        if (getClass() == otherObject.getClass()) {
            var other = (DiscountedItem) otherObject;
            return discount == other.discount;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}
