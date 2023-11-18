import java.util.*;

public class FiveSix_solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0){
            return new int[0][];
        }

        Arrays.sort(intervals,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }

        });

        List<int[]> res = new ArrayList<>();
        int l=intervals[0][0];
        int r=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int [] interval = intervals[i];
            if(interval[0]>r){
                res.add(new int[]{l,r});
                l=interval[0];
            }
            r=Math.max(interval[1],r);
        }

        res.add(new int[]{l,r});

        return res.toArray(new int[res.size()][]);

    }

}
