package Chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("bob","fred","anna"));
        // a) using iterator
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String upperCaseString = iterator.next().toUpperCase();
            iterator.set(upperCaseString);
        }
        System.out.println(list);
        // b) loop over index value
        for (int i = 0; i < list.size(); i++){
            list.set(i,list.get(i).toUpperCase());
        }
        // c) replaceAll method
        list.replaceAll(String::toUpperCase);
    }
}
