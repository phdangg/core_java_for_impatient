package Chapter4;

public final class NonEmptyStringList implements StringList {
    private final String head;
    private final StringList tail;

    public NonEmptyStringList(String head, StringList tail) {
        this.head = head;
        this.tail = tail;
    }

    public String getHead() {
        return head;
    }

    public StringList getTail() {
        return tail;
    }

    @Override
    public int size() {
        return 1 + tail.size();
    }

    @Override
    public StringList append(StringList other) {
        return new NonEmptyStringList(head, tail.append(other));
    }

    @Override
    public String toString() {
        return head + " -> " + tail.toString();
    }
}
