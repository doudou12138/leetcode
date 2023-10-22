import java.util.HashMap;

public class OneOOONineSeven_solution {
    public int minGroupsForValidAssignment(int[] nums) {
        HashMap<Integer,Integer> number_times = new HashMap<>();

        for(int i:nums){
            Integer times=number_times.get(i);
            if(times==null){
                number_times.put(i,1);
            }else{
                number_times.put(i,times+1);
            }
        }


        int min=Integer.MAX_VALUE;
        for(int times:number_times.values()){
            if(min>times+1){
                min=times+1;
            }
        }

        int tar=1;
        for(int i=min;i>=0;--i){

            boolean able=true;
            for(int times:number_times.values()){
                int di=(times+i-1)/i;
                int rest = i*di-times;
                if(di<rest){
                    able=false;
                    break;
                }
            }
            if(able){
                tar=i;
                break;
            }

        }

        int res=0;
        for(int times:number_times.values()){
            res+=(times+tar-1)/tar;
        }

        return res;

    }


}
