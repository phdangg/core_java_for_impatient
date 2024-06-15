package Chapter6;

import javax.management.RuntimeMBeanException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.IntFunction;


public class Chp6 {
    public static void main(String[] args) {
        Entry<Integer,Integer> one = new Entry<>(1,100);
        Entry<Integer,Integer> two = new Entry<>(2,200);
        Entry<Integer,Integer> three = new Entry<>(3,300);
        Entry<Integer,Integer> four = new Entry<>(4,400);
        Table<Integer,Integer> table = new Table<>();
        table.add(one);
        table.add(two);
        table.add(three);
        table.add(four);
        table.setValue(1,1000);
        table.remove(2);
        System.out.println(table);
        Double[] result = Chp6.<Double>swap(0, 1, 1.5, 2.0, 3.0);

    }
    public static <E extends Comparable<E>> E min(E[] arr){
        if (arr.length == 0) return null;
        int min = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].compareTo(arr[min]) < 0){
                min = i;
            }
        }

        return arr[min];
    }
    public static <E extends Comparable<E>> Pair<E> minMax(E[] arr){
        E min = Chp6.<E>min(arr);
        return new Pair<>(min,min);
    }
    public static <T> void minmax(List<T> elements, Comparator<? super T> comp, List<? super T> result){
        elements.sort(comp);
        result.add(elements.get(0));
        result.add(elements.get(elements.size()-1));

    }
    public static <T> void maxmin(List<T> elements, Comparator<? super T> comp,List<? super T> result) {
        minmax(elements, comp, result);
    }
    public static <T extends AutoCloseable> void
    closeAll(ArrayList<T> elems)
            throws Exception {
        for (T elem : elems) elem.close();
    }
    public static <T, R> ArrayList<R> map(ArrayList<T> list, Function<T, R> function) {
        ArrayList<R> result = new ArrayList<>();
        for (T element : list) {
            result.add(function.apply(element));
        }
        return result;
    }

    private static <T> void swapHelper(ArrayList<T> elements,
                                       int i, int j) {
        T temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }
    @SafeVarargs
    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }
    public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
        T[] result = constr.apply(n);
        for (int i = 0; i < n; i++) result[i] = obj;
        return result;
    }

    public static <T> T[] repeat(int n, T... obj) {
        @SuppressWarnings("unchecked") Class<? extends Object[]> cl = obj.getClass();
        @SuppressWarnings("unchecked") T[] result
                = (T[]) java.lang.reflect.Array.newInstance(cl, n*obj.length);
        for (int i = 0; i < n; i++) result[i] = obj[i%obj.length];


        return result;
    }
    @SuppressWarnings("unchecked")
    private static <T extends Throwable>
    void throwAs(Throwable e) throws T {
        throw (T) e; // The cast is erased to (Throwable)
    }
    public static <V> V doWork(Callable<V> c) {
        try {
            return c.call();
        } catch (Throwable ex) {
            Chp6.<RuntimeException>throwAs(ex);
            return null;
        }
    }
    public int min(int a){
        return 0;
    }
    public double min(int a,int b){
        return 0;
    }
}
