import java.util.ArrayList;
import java.util.List;

public class FiveFour_solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top=0;
        int left=0;

        int len=matrix[0].length;
        int hei=matrix.length;
        int right=len-1;
        int bottom=hei-1;

        int time=0;
        while(time++<(Math.min(len,hei)+1)/2){
            for(int i=left;i<=right;++i){
                result.add(matrix[top][i]);
            }

            for(int i=top+1;i<=bottom;++i){
                result.add(matrix[i][right]);
            }

            if(bottom!=top){
                for(int i=right-1;i>=left;--i){
                    result.add(matrix[bottom][i]);
                }
            }

            if(left!=right){
                for(int i=bottom-1;i>top;--i){
                    result.add(matrix[i][left]);
                }
            }

            left++;
            right--;
            top++;
            bottom--;
        }

        return result;
    }
}
