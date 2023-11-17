public class SixFour_solution {
    public int minPathSum(int[][] grid) {
        int hei=grid.length;
        int wid = grid[0].length;

        int[] res = new int[wid+1];
        for(int i=wid-1;i>=0;--i){
            res[i]=res[i+1]+grid[hei-1][i];
        }
        res[wid] = Integer.MAX_VALUE;
        for(int j=hei-2;j>=0;--j) {
            for (int i = wid - 1; i >= 0; --i) {
                res[i] = Math.min(res[i + 1], res[i]) + grid[j][i];
            }
        }


        return res[0];
    }
}
