package Chapter4;

public final class EmptyStringList implements StringList{
    @Override
    public int size() {
        return 0;
    }

    @Override
    public StringList append(StringList other) {
        return other;
    }

    @Override
    public String toString() {
        return "Empty";
    }
}
