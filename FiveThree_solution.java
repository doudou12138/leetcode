import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class FiveThree_solution {
    public int maxSubArray(int[] nums) {

        //答案也可能是负数.当左边sum为负时就应该舍弃,不要在加进来了.
        //但是 对于负数我们也应该和最大值比较.毕竟如果全是负数,最大值也就是负数了
        int len = nums.length;
        int sum=0;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<len;++i){
            sum+=nums[i];
            res=Math.max(sum,res);
            if(sum<0){
                sum=0;
            }
        }

        Collections collection;

        return res;
    }
}
