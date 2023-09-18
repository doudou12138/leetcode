public class SixTwo_solution {
    //重复计算->递归超时
//    public int uniquePaths(int m, int n) {
//        if(m==1||n==1){
//            return 1;
//        }
//        return uniquePaths(m-1,n)+uniquePaths(m,n-1);
//    }

    public int uniquePaths(int m,int n){
        int[][] nums = new int[m][n];
        for(int i=0;i<m;++i){
            nums[i][0]=1;
        }
        for(int i=0;i<n;++i){
            nums[0][i]=1;
        }

        for(int i=1;i<m;++i){
            for(int j=1;j<n;++j){
                nums[i][j]=nums[i-1][j]+nums[i][j-1];
            }
        }

        return nums[m-1][n-1];
    }

    //运用数学排列组合的知识
//    public int uniquePaths(int m,int n){
//        long sum=1;
//        for(int i=0;i<m-1;++i){
//            //不行
//            // sum = sum*(m+n-2-i)/(m-1-i);
//            sum=sum*(n+i)/(i+1);
//        }
//
//        return (int)sum;
//    }
}
