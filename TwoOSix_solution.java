import java.util.ArrayList;
import java.util.List;

public class TwoOSix_solution {
    List<List<Integer>> edges = new ArrayList<>();
    int[] visited;
    boolean valid=true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        visited = new int[numCourses];

        for(int i=0;i< numCourses;++i){
            edges.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;++i){
            edges.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        for(int i=0;i<numCourses;++i){
            if(visited[i]==0){
                if(!dfs(i)){
                    return false;
                }
            }
        }

        return valid;
    }

    private boolean dfs(int n){
        visited[n]=1;
        List<Integer> target = edges.get(n);
        for(int i=0;i<target.size();++i){
            if(visited[target.get(i)]==1){
                valid = false;
                return false;
            }else if(visited[target.get(i)]==0){
                if(!dfs(target.get(i))){
                    return false;
                };
            }
        }

        visited[n]=2;
        return true;
    }

}
