public class NineOne_solution {

    public int numDecodings(String s) {
        int a=0,b=0,c=0;

        int i=0;
        if(s.charAt(i)=='0'){
            return 0;
        }else if(s.length()==1){
            return 1;
        }
        int num = (s.charAt(0)-'0')*10+s.charAt(1)-'0';
        if(num<=26){
            if(num%10==0){
                b=1;
                a=1;
            }else{
                a=1;
                b=2;
            }
        }else{
            if(num%10==0){
                return 0;
            }else{
                a=1;
                b=1;
            }
        }
        c=b;

        for(i=2;i<s.length();++i){
            c=0;
            if(s.charAt(i)!='0'){
                c += b;
            }

            if((s.charAt(i-1)-'0')*10+s.charAt(i)-'0'<=26&&s.charAt(i-1)!='0'){
                c += a;
            }
            a=b;
            b=c;
        }

        return c;

    }

}
