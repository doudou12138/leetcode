import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class LCR_OneFiveNine_solution {
    public int[] inventoryManagement(int[] stock, int cnt) {
        //return  Arrays.stream(stock).sorted().limit(cnt).toArray();

        if(cnt==0){
            return new int[0];
        }

        PriorityQueue<Integer> stock_qu= new PriorityQueue<>(
                new Comparator<Integer>() {
                    public int compare(Integer o1, Integer o2) {
                        return o2-o1;
                    }
                }
        );
        for(int i=0;i<cnt;++i){
            stock_qu.add(stock[i]);
        }

        for(int i=cnt;i<stock.length;++i){
            if(stock[i]<stock_qu.peek()){
                stock_qu.poll();
                stock_qu.add(stock[i]);
            }
        }

        int [] result = new int[cnt];
        for(int i=0;i<cnt;++i){
            result[i]=stock_qu.poll();
        }
        return result;
    }
}
