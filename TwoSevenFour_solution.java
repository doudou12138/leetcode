import java.util.Comparator;
import java.util.PriorityQueue;

public class TwoSevenFour_solution {
    public int hIndex(int[] citations) {
        int len=citations.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2-o1;
                    }
                }
        );

        for(int i:citations){
            pq.add(i);
        }

        int able=1;
        for(;able<len;++able){
            int num=pq.poll();
            if(num<able){
                return able-1;
            }
        }

        return able;
    }

}
