import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneOneEight_solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        result.add(Arrays.asList(1));
        for(int i=1;i<numRows;++i){
            List<Integer> iterator = new ArrayList<>();
            List<Integer> last = result.get(i-1);
            iterator.add(1);
            for(int j=1;j<i;++j){
                iterator.add(last.get(j-1)+last.get(j));
            }
            iterator.add(1);
            result.add(iterator);
        }

        return result;
    }

}
