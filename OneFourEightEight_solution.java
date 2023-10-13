import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class OneFourEightEight_solution {
    public  int[] avoidFlood(int[] rains) {
        int len=rains.length;
        HashMap<Integer,Integer> rainPools = new HashMap<>();
        TreeSet<Integer> sunDate = new TreeSet<>();

        int[] result = new int[len];

        for(int i=len-1;i>=0;--i){
            if(rains[i]!=0){
                Integer date = rainPools.get(rains[i]);
                if(date!=null){

                    Integer pullDateIndex = sunDate.floor(date);
                    if(pullDateIndex==null){
                        return new int[0];
                    }else{
                        result[pullDateIndex]=rains[i];
                        sunDate.remove(pullDateIndex);
                    }

                }
                result[i]=-1;
                rainPools.put(rains[i],i);
            }else{
                sunDate.add(i);
            }
        }

        //没用上的抽干机会,也填上数
        for(int i:sunDate){
            result[i]=1;
        }

        return result;
    }


}
