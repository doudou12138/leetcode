import java.util.*;

public class ThreeOneEight_solution {
    public int maxProduct(String[] words) {

        HashMap<Integer,Integer> word_len = new HashMap<>();

        for(String str:words) {
            int word = 1;
            for (int i = 0; i < str.length(); ++i) {
                word |= 1 << (str.charAt(i) - 'a' + 1);
            }
            word_len.merge(word, str.length(), Math::max);
        }

        int max=0;
        Set<Integer> keys = word_len.keySet();
        for(int i:keys){
            for(int j:keys){
                if((i&j)==1){
                    max = Math.max(max,word_len.get(i)*word_len.get(j));
                }
            }
        }

        return max;

    }

}
