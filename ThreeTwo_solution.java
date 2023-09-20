import java.util.Stack;

public class ThreeTwo_solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> pare_stack = new Stack<>();
        pare_stack.push(-1);

        int max=0;
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)=='('){
                pare_stack.push(i);
            }else{
                pare_stack.pop();
                if(pare_stack.empty()){
                    pare_stack.push(i);
                }else{
                    max=Math.max(max,i-pare_stack.peek());

                }

            }
        }

        return max;
    }
}
