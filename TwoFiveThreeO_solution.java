import java.util.Comparator;
import java.util.PriorityQueue;

public class TwoFiveThreeO_solution {
    public long maxKelements(int[] nums, int k) {
        long result = 0;

        PriorityQueue<Integer> nums_Pri = new PriorityQueue<>(
//                new Comparator<Integer>(){
//                    @Override
//                    public int compare (Integer o1, Integer o2){
//                        return o2 - o1;
//                    }
//                }
                //可以使用lambda表达式代替
                (a,b)->b-a
        );

        for(int i:nums){
            nums_Pri.offer(i);
        }

        for(int i=0;i<k;++i){
            int x=nums_Pri.poll();
            result+=x;
            nums_Pri.offer((x+2)/3);
        }

        return result;
    }
}
