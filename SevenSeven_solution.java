import java.util.ArrayList;
import java.util.List;

public class SevenSeven_solution {
    public List<List<Integer>> combine(int n, int k) {
        if(k==1){
            List<List<Integer>> result = new ArrayList<>();
            for(int i=1;i<=n;++i){
                result.add(new ArrayList<>(List.of(i)));
            }
            return result;
        }
        if(n==k){
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> a_list = new ArrayList<>();
            for(int i=1;i<=n;++i){
                a_list.add(i);
            }
            result.add(a_list);
            return result;
        }
        List<List<Integer>> result = combine(n-1,k-1);
        for(List<Integer> list:result){
            list.add(n);
        }
        result.addAll(combine(n-1,k));

        return result;
    }


}
