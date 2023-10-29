public class OneOOOneOFour_solution {
    public int minChanges(String s) {
        char last = s.charAt(0);
        int last_index = 0;
        int res=0;
        for(int j=1;j<s.length();++j){
            if(s.charAt(j)!=last){
                if(((j-last_index)&1)==1){
                    res++;
                    last_index=j+1;
                    if(last_index>=s.length()){
                        return res;
                    }
                    last=s.charAt(last_index);
                }else{
                    last_index=j;
                    last=s.charAt(last_index);
                }
            }
        }

        return res;
    }
}
