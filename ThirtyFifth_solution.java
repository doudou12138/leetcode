class ThirtyFifth_solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        //在中间过程中,就搜索到
        while(left+1<right){
            int middle = (left+right)/2;
            if(nums[middle]==target){
                return middle;
            }
            if(nums[middle]<target){
                left=middle;
            }else{
                right=middle;
            }
        }

        //来到最后两项时
        if(nums[left]>=target){
            return left;
        }
        if(nums[right]<target){
            return right+1;
        }
        return right;

    }
}
