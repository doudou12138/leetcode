import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class OneOneNine_solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(List.of(1));
        //第i行
        for(int i=1;i<=rowIndex;++i){
            List<Integer> now = new ArrayList<>(List.of(1));
            //第i行有i+1个数

            for(int j=1;j<(i+1)/2;++j){
                now.add(result.get(j-1)+result.get(j));
            }

            if(i%2==0){
                now.add(2*result.get(result.size()-1));
            }

            result = now;
        }

        for(int i=rowIndex%2==0?result.size()-2:result.size()-1;i>=0;--i){
            result.add(result.get(i));
        }

        return result;

    }


}
