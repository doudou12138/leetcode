import java.util.Stack;

public class FourTwo_solution {
    public int trap(int[] height) {

        //一列一列地计算，每一列的积水量取决于两边的最大高度。在计算两边最大高度时使用了动态规划思想
//        int sum=0;
//        int max_l = height[0];
//        int max_r = 0;
//
//        for(int i=2;i<height.length;++i){
//            max_r = Math.max(max_r,height[i]);
//        }
//
//        for(int i=1;i<height.length-1;++i){
//            //两边均有比它高的
//            if(height[i]<max_l&&height[i]<max_r){
//                sum+=Math.min(max_l,max_r)-height[i];
//            }else{//两边不比它高
//                //比左边高
//                if(height[i]>max_l){
//                    max_l=height[i];
//                }
//            }
//
//            //如果下一根的长度与max_r相同，重新找max_r
//            if(height[i+1]==max_r){
//                max_r=0;
//                for(int j=i+2;j<height.length;++j){
//                    max_r=Math.max(max_r,height[j]);
//                }
//            }
//            //不同max_r不变
//        }
//
//        return sum;

        //栈的思想
        int sum=0;
        Stack<Integer> left = new Stack<>();
        for(int i=0;i<height.length;++i){
            if(left.empty()){
                left.push(i);
            }else if(height[i]<=height[left.peek()]){
                left.push(i);
            }else{
                int last_height=0;
                while(height[left.peek()]<=height[i]||left.empty()){
                    sum+=(height[left.peek()]-last_height)*(i-left.peek());
                    last_height=left.pop();
                }
                left.push(i);
            }
        }
        return sum;
    }
}
