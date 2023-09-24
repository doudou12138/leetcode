import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class OneFourSix_solution {

    private class MapNode{
        int key;
        int value;
        MapNode prev;
        MapNode next;

        public MapNode() {}

        public MapNode(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    private HashMap<Integer,MapNode> linkedMap;
    private MapNode head;
    private MapNode tail;
    private int capacity;
    private int size;

    public OneFourSix_solution(int capacity){
        this.capacity=capacity;
        this.size=0;
        linkedMap = new HashMap<>(capacity);
        head=new MapNode();
        tail = new MapNode();
        head.next=tail;
        tail.prev=head;
    }

    public int get(int key) {
        MapNode target = linkedMap.get(key);
        if(target==null){
            return -1;
        }else{
            toHead(target);
            return target.value;
        }
    }

    public void put(int key, int value) {
        MapNode target = linkedMap.get(key);
        if(target!=null){
            target.value=value;
            toHead(target);
        }else{
            if(size==capacity){
                replaceOldNode(key,value);
            }else{
                addNewNode(key,value);
            }
        }
    }

    private void toHead(MapNode node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;
    }

    private void replaceOldNode(int key,int value){
        MapNode oldNode = tail.prev;
        tail.prev=oldNode.prev;
        tail.prev.next=tail;

        linkedMap.remove(oldNode.key);
        oldNode.key=key;
        oldNode.value=value;
        oldNode.prev=head;
        oldNode.next=head.next;
        head.next=oldNode;
        oldNode.next.prev=oldNode;
        linkedMap.put(key,oldNode);

    }

    private void addNewNode(int key,int value){
        MapNode target = new MapNode(key,value);
        target.prev=head;
        target.next=head.next;
        head.next=target;
        target.next.prev=target;

        linkedMap.put(key,target);
        size++;
    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */