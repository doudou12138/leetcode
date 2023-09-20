import java.util.Arrays;

public class FiveNine_solution {
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int init = 1;
        for(int i=0;i<(n+1)/2;++i){

            for(int j=i;j<n-i;++j){
                result[i][j]=init++;
            }

            for(int j=i+1;j<n-i;++j){
                result[j][n-1-i]=init++;
            }

            for(int j=n-i-2;j>=i;--j){
                result[n-i-1][j]=init++;
            }

            for(int j=n-i-2;j>i;--j){
                result[j][i]=init++;
            }

        }

        return result;

    }

}
