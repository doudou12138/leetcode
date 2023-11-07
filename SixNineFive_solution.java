public class SixNineFive_solution {
    private static int height;
    private static int width;

    public int maxAreaOfIsland(int[][] grid) {
        height=grid.length;
        width = grid[0].length;

        int max=0;

        for(int i=0;i<height;++i){
            for(int j=0;j<width;++j){
                if(grid[i][j]==1){
                    max=Math.max(dfs(grid,i,j),max);
                }
            }
        }

        return max;
    }

    private int dfs(int[][] grid,int i,int j){
        if(i<0||j<0||i>=height||j>=width||grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        return dfs(grid,i-1,j)+dfs(grid,i,j+1)+dfs(grid,i+1,j)+dfs(grid,i,j-1)+1;
    }
}
