import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SevenThree_solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> line = new HashSet<>();
        Set<Integer> row = new HashSet<>();

        for(int i=0;i<matrix.length;++i){
            for(int j=0;j<matrix[0].length;++j){
                if(matrix[i][j]==0){
                    line.add(j);
                    row.add(i);
                }
            }
        }

        for(int i:line){
            for(int j=0;j<matrix.length;++j){
                matrix[j][i]=0;
            }
        }

        for(int i:row){
            for(int j=0;j<matrix[0].length;++j){
                matrix[i][j]=0;
            }
        }
    }

}
