import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OneFourOTwo_solution {
    public int maxSatisfaction(int[] satisfaction) {
       Arrays.sort(satisfaction);
        int len=satisfaction.length;

        int result=0;
        int sum=0;
        for(int i=len-1;i>=0;--i){
            int sat=satisfaction[i];
            int add=sum+sat;
            if(add>=0){
                result+=add;
                sum+=sat;
            }else{
                return result;
            }
        }

        return result;
    }


}


