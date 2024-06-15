package Chapter7;

import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        V s = new V("s");
        V t = new V("t");
        V x = new V("x");
        V y = new V("y");
        V z = new V("z");
        Map<V, ArrayList<Neighbor>> nodes = new HashMap<>();
        nodes.computeIfAbsent(s,k->new ArrayList<>()).
                addAll(List.of(
                        new Neighbor(t,10),
                        new Neighbor(y,5)));

        nodes.computeIfAbsent(t,k->new ArrayList<>()).
                addAll(List.of(
                        new Neighbor(x,1),
                        new Neighbor(y,2)));

        nodes.computeIfAbsent(x,k->new ArrayList<>()).
                addAll(List.of(
                        new Neighbor(z,4)));

        nodes.computeIfAbsent(y,k->new ArrayList<>()).
                addAll(List.of(
                        new Neighbor(t,3),
                        new Neighbor(x,9),
                        new Neighbor(z,2)));

        nodes.computeIfAbsent(z,k->new ArrayList<>()).
                addAll(List.of(
                        new Neighbor(s,7),
                        new Neighbor(x,6)));

        DIJKSTRA(nodes,s);
    }
    public static void DIJKSTRA(Map<V, ArrayList<Neighbor>> nodes, V s){
        INITIALIZE_SINGLE_SOURCE(nodes,s);
        ArrayList<V> S = new ArrayList<>();
        PriorityQueue<V> Q = new PriorityQueue<>(Comparator.comparingInt(v -> v.d));
        Q.addAll(nodes.keySet());
        while (!Q.isEmpty()){
            V u = Q.poll();
            S.add(u);
            for (Neighbor neighbor: nodes.get(u)){
                if (RELAX(u, neighbor)) {
                    // Remove and reinsert the neighbor.v to update its priority in the queue
                    Q.remove(neighbor.v);
                    Q.add(neighbor.v);
                }
            }
        }
        for (V v : S){
            System.out.println(v.name);
        }
    }
    public static void INITIALIZE_SINGLE_SOURCE(Map<V, ArrayList<Neighbor>> nodes, V s){
        for (V v: nodes.keySet()){
            v.d = Integer.MAX_VALUE;
            v.pi = null;
        }
        s.d = 0;
    }

    public static boolean RELAX(V u, Neighbor neighborOfU){
        if (neighborOfU.v.d > u.d + neighborOfU.distance){
            neighborOfU.v.d = u.d + neighborOfU.distance;
            neighborOfU.v.pi = u;
            return true;
        }
        return false;
    }
    public static class V implements Comparable<V>{
        String name;
        V pi;
        int d;
        V(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(V o) {
            return Integer.compare(this.d, o.d);
        }

    }
    public static class VComparison implements Comparable<V>{

        @Override
        public int compareTo(V o) {
            return 0;
        }
    }
    public static class Neighbor{
        V v;
        int distance;
        Neighbor(V v, int distance){
            this.v = v;
            this.distance = distance;
        }
    }
}
