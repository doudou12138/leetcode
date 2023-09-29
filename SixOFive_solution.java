public class SixOFive_solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0,j=1;
        int len= flowerbed.length;
        int sum=0;

        for(;i<len;++i){
            if(flowerbed[i]==0){
                for(j=i;j<len&&flowerbed[j]==0;++j){
                }

                int space = j-i-1;
                if(i==0){
                    space++;
                }
                if(j>=len){
                    space++;
                }
                sum+=space/2;

                i=j;
            }
        }

        return sum>=n;
    }
}
