public class TwoONine_solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int left=0;
        int right=0;

        int len=0;
        while(right<nums.length) {
            sum += nums[right];
            right++;
            if (sum >= target) {
                while (sum >= target) {
                    sum -= nums[left];
                    left++;
                }
                len = len==0?right+1-left:len;
                len = Math.min(len, right + 1 - left);
            }
        }

        return len;
    }
}
