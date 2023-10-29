import java.util.List;

public class OneOOOFourTwo_solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int size=nums.size();
        int[][] dp = new int[size][target+1];

        int zero_index = nums.get(0);
        if(zero_index<=target){
            dp[0][nums.get(0)]=1;
        }

        for(int i=1;i<size;++i){
            int num = nums.get(i);
            int j=0;
            if(target<num){
                for(;j<=target;++j){
                    dp[i][j]=dp[i-1][j];
                }
            }else{
                for(;j<num;++j){
                    dp[i][j]=dp[i-1][j];
                }
                dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-num]+1);
                j++;
                for(;j<=target;++j){
                    int len=dp[i-1][j-num];
                    if(len!=0){
                        len++;
                    }
                    dp[i][j]=Math.max(dp[i-1][j],len);
                }
            }
        }

        int res=dp[size-1][target];
        if(res==0){
            return -1;
        }
        return res;
    }

}
