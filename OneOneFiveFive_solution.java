public class OneOneFiveFive_solution {

    public int numRollsToTarget(int n, int k, int target) {
        long[] dp = new long[target+1];
        int mod=(int)(1e9+7);

        for(int i=1;i<Math.min(target+1,k+1);++i){
            dp[i]=1;
        }

        for(int i=1;i<n;++i){

            for(int j=target;j>0;--j){

                //一定要记得先清0,因为筛子不能到0.
                //清0前dp[j]表示i-1个骰子,和为j的种数
                dp[j]=0;

                int bound = Math.min(j,k);
                for(int m=bound;m>=1;--m){
                    dp[j] += dp[j-m]%mod;
                }
                dp[j] %=mod;
            }

        }

        return (int)(dp[target]%mod);
    }


}
