import java.util.ArrayList;
import java.util.List;

public class TwoOneO_solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> result = new ArrayList<>();
        int[] visited = new int[numCourses];

        List<List<Integer>> preCourses = new ArrayList<>(numCourses);

        for(int i=0;i<numCourses;++i){
            preCourses.add(new ArrayList<>());
        }

        for(int i=0;i< prerequisites.length;++i){
            preCourses.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        for(int i=0;i<numCourses;++i){
            if(!dfs(preCourses,i,visited,result)){return new int[0];}
        }

        int [] result_arr = new int[numCourses];
        for(int i=0;i<numCourses;++i){
            result_arr[i]=result.get(i);
        }
        return result_arr;
    }

    private boolean dfs(List<List<Integer>> preCourses,int n,int[] visited,List<Integer> result){
        if(visited[n]==1){
            //正在访问该节点,出现循环
            return false;
        }else if(visited[n]==0) {
            visited[n]=1; //开始访问
            List<Integer> preCourse = preCourses.get(n);
            for (int i : preCourse) {
                if(!dfs(preCourses, i, visited, result)){return false;};
            }
            //访问结束
            result.add(n);
            visited[n]=2;
        }
        return true;
    }


}

