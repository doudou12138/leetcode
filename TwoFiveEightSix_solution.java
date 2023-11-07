import java.util.*;

public class TwoFiveEightSix_solution {

    private final Set<Character> set = new HashSet<Character>(){{
        add('a');
        add('e');
        add('i');
        add('o');
        add('u');
    }};

    public int vowelStrings(String[] words, int left, int right) {

        int res=0;
        for(int i=left;i<=right;++i){
            String str = words[i];
            if(isYuan(str)){
                res++;
            }
        }

        return res;
    }

    private boolean isYuan(String str){

        return set.contains(str.charAt(0))&&set.contains(str.charAt(str.length()-1));
    }


    sjeioewje

}
