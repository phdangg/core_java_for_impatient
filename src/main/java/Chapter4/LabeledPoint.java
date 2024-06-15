package Chapter4;

import java.util.Objects;

public class LabeledPoint extends Point {
    private final String label;
    LabeledPoint(String label, double x, double y){
        super(x,y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "x=" + x +
                ", y=" + y +
                ", label='" + label + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LabeledPoint that = (LabeledPoint) o;
        return Double.compare(x, that.x) == 0 && Double.compare(y, that.y) == 0 && Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, label);
    }
}
