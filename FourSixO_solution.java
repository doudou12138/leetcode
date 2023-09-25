import java.util.HashMap;
import java.util.TreeSet;

public class FourSixO_solution {
    HashMap<Integer,Node> treeMap;
    int size;
    int capacity;
    TreeSet<Node> tree;
    int time_all;

    public FourSixO_solution(int capacity) {
        treeMap=new HashMap<Integer, Node>(capacity);
        size=0;
        this.capacity=capacity;
        tree = new TreeSet<>();
        time_all=0;
    }

    public int get(int key) {
        Node target = treeMap.get(key);
        if(target==null){
            return -1;
        }else{
            tree.remove(target);
            target.count++;
            target.time=time_all++;
            tree.add(target);
            return target.value;
        }
    }

    public void put(int key, int value) {
        Node old = treeMap.get(key);
        if(old==null){
            if(size==capacity){
                Node min = tree.first();
                tree.remove(min);
                min.value=value;
                min.count=1;
                min.time=time_all++;
                treeMap.remove(min.key);
                treeMap.put(key,min);
                min.key=key;
                tree.add(min);
            }else{
                Node fresh = new Node();
                fresh.key=key;
                fresh.value=value;
                fresh.count=1;
                fresh.time=time_all++;
                treeMap.put(key,fresh);
                tree.add(fresh);
            }
        }else{
            tree.remove(old);
            old.count++;
            old.time=time_all++;
            old.value=value;
            tree.add(old);
        }
    }

    private class Node implements Comparable<Node>{
        int key;
        int value;
        int count;
        int time;

        @Override
        public int compareTo(Node o) {
            return this.count-o.count==0?this.time-o.time:this.count-o.count;
        }

        public boolean equals(Object anObject) {
            if (this == anObject) {
                return true;
            }
            if (anObject instanceof Node) {
                Node rhs = (Node) anObject;
                return this.count == rhs.count && this.time == rhs.time;
            }
            return false;
        }


    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */