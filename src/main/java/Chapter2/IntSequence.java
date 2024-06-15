package Chapter2;

public interface IntSequence {
    default boolean hasNext() {return true;}
    int next();
    public static IntSequence of (int ...values){
        return new IntSequence() {
            private int index = 0;
            @Override
            public int next() {
                return values[index++];
            }
            public boolean hasNext(){
                return index < values.length;
            }
        };
    }
    public static IntSequence constant(int value){
        return new IntSequence() {
            @Override
            public int next() {
                return value;
            }
        };
    }
}
