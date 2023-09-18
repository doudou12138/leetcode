public class SixTwo {
    public int uniquePaths(int m, int n) {
        long sum=1;
        for(int i=0;i<m;++i){
            sum=sum*(m+n-2-i)/(i+1);
        }
        return (int)sum;
    }
}
