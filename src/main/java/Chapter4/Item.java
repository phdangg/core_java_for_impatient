package Chapter4;

import java.util.Objects;

public class Item {
    private String description;
    private double price;
    Item(String description, double price){
        this.description = description;
        this.price = price;
    }
    public boolean equals(Object otherObject) {
        // A quick test to see if the objects are identical
        if (this == otherObject) return true;
        // Must return false if the argument is null
        if (otherObject == null) return false;
        // Check that otherObject is an Item
        if (getClass() != otherObject.getClass()) return false;
        // Test whether the instance variables have identical values
        var other = (Item) otherObject;
        return description.equals(other.description)
                && price == other.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price);
    }
}
