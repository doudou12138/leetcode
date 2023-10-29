import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OneOOONineFour_solution {
    public int sumCounts(int[] nums) {
        HashMap<Integer,Integer> last = new HashMap<>();
        long res=0;
        for(int j=0;j<nums.length;++j) {
            int num = nums[j];
            last.merge(num, 1, Integer::sum);

            HashMap<Integer, Integer> now = new HashMap<>(last);
            long size= now.size();
            res = (res + size*size) % (1000000009);

            for (int i = 0; i < j; ++i) {
                num = nums[i];
                Integer count = now.get(num);
                if (count == 1) {
                    now.remove(num);
                } else {
                    now.put(num, count - 1);
                }
                size=now.size();
                res = (res + size*size) % (1000000009);
            }

        }

        return (int)res%(1000000009);
    }

}
