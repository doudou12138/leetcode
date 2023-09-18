import java.util.HashMap;
import java.util.List;

public class FiveFive_solution {
    public boolean canJump(int[] nums) {
        //最小下标位置初始化为len-1,即最后一位
        int canIdx=nums.length-1;

        for (int idx = nums.length-2; idx >=0 ; --idx) {
            //如果当前位置能到达,最小下标位置;则最小下标位置更新
            if(idx+nums[idx]>= canIdx){
                canIdx=idx;
            }
            //如果当前位置不能到达则继续向左边遍历即可
        }
        return canIdx==0;

    }

}

