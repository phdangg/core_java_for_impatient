package Chapter6;

import java.util.ArrayList;

public class Table <K, V> {

    private ArrayList<Entry<K, V>> table;
    Table(){
        table = new ArrayList<>();
    }
    public void add(Entry<K,V> e){
        table.add(e);
    }
    public V getValue(K key){
        for (var e : table){
            if (e.getKey() == key)
                return e.getValue();
        }
        return null;
    }
    public int getIndex(K key){
        for (int i = 0; i < table.size(); i++){
            if (table.get(i).getKey() == key){
                return i;
            }
        }
        return -1;
    }
    public void setValue(K key, V value){
       table.set(getIndex(key),new Entry<>(key,value));
    }
    public void remove(K key){
        table.remove(getIndex(key));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (var e : table){
            stringBuilder.append("Key: ").append(e.getKey()).append(" Value: ").append(e.getValue()).append("\n");
        }
        return stringBuilder.toString();
    }
}
