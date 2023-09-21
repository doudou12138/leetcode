import java.util.HashSet;

public class OneThreeSix_solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i:nums){
            result^=i;
        }
        return result;
//        HashSet<Integer> num = new HashSet<>();
//        for(int i=0;i<nums.length;++i){
//            if(num.contains(nums[i])){
//                num.remove(nums[i]);
//            }else{
//                num.add(nums[i]);
//            }
//        }
//        return (int) num.toArray()[0];
    }
}
