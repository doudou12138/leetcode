import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SevenSeven_solution {
    //这里如果使用LinkedList是非常慢的,因为后面经常会使用temp.size(),数组实现会更快
    List<Integer> temp = new ArrayList<>();
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(1,n,k);
        return result;
    }

    private void dfs(int cur,int n,int k){
        if(temp.size()+n-cur+1<k){
            return;
        }
        if(temp.size()==k){
            result.add(new ArrayList<>(temp));
            return;
        }

        temp.add(cur);
        dfs(cur+1,n,k);

        temp.remove(temp.size()-1);
        dfs(cur+1,n,k);
    }




}
