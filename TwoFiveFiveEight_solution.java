import java.util.Comparator;
import java.util.PriorityQueue;

public class TwoFiveFiveEight_solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2-o1;
                    }
                }
        );

        for(int i:gifts){
            pq.add(i);
        }

        for(int i=0;i<k;++i){
            pq.add((int) Math.floor(Math.sqrt( pq.poll())));
        }

        int res=0;
        for(int i:pq){
            res+=i;
        }

        return res;
    }

}
