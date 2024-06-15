package Chapter2;

public interface Sequence<T> {
    default boolean hasNext() {return true;}
    T next();
}
