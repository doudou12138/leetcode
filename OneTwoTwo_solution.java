public class OneTwoTwo_solution {
    public int maxProfit(int[] prices) {
        int last=-1;
        int sum=0;
        for(int i=0;i<prices.length-1;++i){
            int next=prices[i+1]-prices[i];
            if(last*next<0){
                if(last<0){
                    sum-=prices[i];
                }else{
                    sum+=prices[i];
                }
            }
            last=next==0?last:next;
        }

        if(last>0){
            sum+=prices[prices.length-1];
        }
        return sum;
    }
}
