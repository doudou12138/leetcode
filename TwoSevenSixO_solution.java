public class TwoSevenSixO_solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int len=nums.length;
        int res=0;

        int left=nextTwo(nums,0,threshold);
        int right=left+1;
        int last=2;

        while(right<len){
            if(left==-1){
                return res;
            }

            int right_value = nums[right];
            int check = last^right_value;
            check &=1;
            if(check!=1||right_value>threshold){
                res=Math.max(res,right-left);
                left=nextTwo(nums,right,threshold);
                right=left;
                last=2;
            }else {
                last=right_value;
            }
            right++;
        }

        return Math.max(res,right-left);

    }

    private int nextTwo(int [] nums,int l,int thread){
        int len = nums.length;
        while(l<len&&((nums[l]&1)==1 || nums[l]>thread)){
            ++l;
        }
        return l>=len?-1:l;
    }

}
