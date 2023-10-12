public class TwoFiveSixTwo_solution {
    public long findTheArrayConcVal(int[] nums) {
        int last = nums.length-1;
        long sum=0;

        int i=0;
        for(;i<(last+1)/2;++i){
            sum+=connect(nums[i],nums[last-i]);
        }

        if((last&1)==0){
            sum+=nums[i];
        }
        return sum;
    }

    private int connect(int a,int b){
        int i=1;
        for(;i<=b;i*=10);
        return a*i+b;
    }
}
