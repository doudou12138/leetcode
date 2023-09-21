import java.util.ArrayList;
import java.util.List;

public class OneTwoO_solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> row_num = triangle.get(triangle.size()-1);

        for(int i=triangle.size()-2;i>=0;--i){
            for(int j=0;j<triangle.get(i).size();++j){
                row_num.set(j,Math.min(row_num.get(j),row_num.get(j+1))+triangle.get(i).get(j));
            }
        }

        return row_num.get(0);
    }
}
