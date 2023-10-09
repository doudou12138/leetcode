import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoFiveSevenEight_solution {
    public static int splitNum(int num) {
        long i=1;
        for(;i<=num;i*=10);
        i/=10;

        List<Integer> nums= new ArrayList<>();
        while(i>=1){
            nums.add((int) (num/i));
            num%=i;
            i/=10;
        }

        Collections.sort(nums);
        int index=nums.size()-1;
        int base=1;
        int sum=0;
        while(index>=1){
            sum+=(nums.get(index)+nums.get(--index))*base;
            base*=10;
            index--;
        }
        if(index==0){
            sum+=(nums.get(0)*base);
        }

        return sum;
    }

}
