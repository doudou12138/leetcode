public class SixNine_solution {
    public int mySqrt(int x) {
        int left=0;
        int right=x;

        int middle = x/2;
        if(x==1){
            return 1;
        }

        while(right-left>1){
            if(x/middle<middle){
                right=middle;
            }else if(x/middle==middle){
                return middle;
            }else if(x/middle>middle){
                left=middle;
            }
            middle=(left+right)/2;
        }

        return left;
    }
}
