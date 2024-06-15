package Chapter6;

import java.util.ArrayList;
import java.util.Collection;

public class Stack <E>{
    private ArrayList<E> s = null;
    Stack(){
        s = new ArrayList<>();
    }
    public void push(Collection<? extends E> src){
        s.addAll(src);
    }
    public void pop(Collection<? super E> dst){
        dst.addAll(s);
    }
    public boolean isEmpty(){
        return s.isEmpty();
    }
}
