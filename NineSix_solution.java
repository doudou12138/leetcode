import java.util.ArrayList;
import java.util.List;
/*
不同的二叉搜索树
 */
public class NineSix_solution {
    public int numTrees(int n) {
        if(n==0){
            return 0;
        }
        int[][] treeNums = new int[n][n];
        for(int i=0;i<n;++i){
            treeNums[i][i]=1;
        }

        for(int j=1;j<n;++j){
            treeNums[j-1][j]=2;

            for(int i=j-2;i>=0;--i){
                treeNums[i][j]+=treeNums[i+1][j];
                for(int k=i+1;k<j;++k){
                    treeNums[i][j]+=treeNums[i][k-1]*treeNums[k+1][j];
                }
                treeNums[i][j]+=treeNums[i][j-1];
            }
        }

        return treeNums[0][n-1];
    }
}
