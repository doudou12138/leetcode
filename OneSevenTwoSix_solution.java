import java.util.HashMap;

public class OneSevenTwoSix_solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int res=0;

        for(int i=0;i<nums.length;++i){
            for(int j=0;j<i;++j){
                int key=nums[j]*nums[i];
                Integer s = map.get(key);
                if(s==null){
                    map.put(key,1);
                }else{
                    res+=s*8;
                    map.put(key,s+1);
                }
            }
        }

        return res;

    }
}
