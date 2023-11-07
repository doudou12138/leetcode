public class TwoOO_solution {

    private static int height = 0;
    private static int width = 0;
    public int numIslands(char[][] grid) {
        height = grid.length;
        width = grid[0].length;

        int res=0;

        for(int i=0;i<height;++i){
            for(int j=0;j<width;++j){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    res++;
                }
            }
        }

        return res;
    }

    private void dfs(char[][] grid,int i,int j){
        if(i<0||j<0||i>=height||j>=width||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
    }

}
