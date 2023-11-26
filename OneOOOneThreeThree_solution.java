public class OneOOOneThreeThree_solution {
    public int minimumCoins(int[] prices) {
        int len=prices.length;

        int minCoins[] = new int[len];

        for(int i=len-1;i>=0;--i){

            if(2*i+2>len-1){
                minCoins[i]=prices[i];
                continue;
            }

            int start = i+1;
            int end = 2*i+2;
            int res=Integer.MAX_VALUE;

            for(int j=end;j>=start;--j){
                res=Math.min(res,minCoins[j]);
            }

            minCoins[i]=res+prices[i];

        }

        return minCoins[0];

    }

}
