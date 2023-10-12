public class FourFive_solution {
//    //时间复杂度O(N^2)
//    public int jump(int[] nums) {
//        int len=nums.length;
//        int [] steps=new int[len];
//        steps[len-1]=0;
//
//        for(int i=nums.length-2;i>=0;--i){
//            steps[i]=minOfRange(steps,i+1,Math.min(i+nums[i],len-1))+1;
//        }
//
//        return steps[0];
//
//    }
//
//    private int minOfRange(int[] arr,int left,int right){
//        int min=arr[left];
//        for(int i=left+1;i<=right;++i){
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        return min;
//    }


    //时间复杂度O(n)
    public int jump(int[] nums){

        int start = 0;
        int end=0;
        int step=0;
        while(end<nums.length-1){
            step++;
            //第step步可以的下标

            int bound=end;
            for(int i=start;i<=end;++i){
                bound=Math.max(bound,i+nums[i]);
            }
            start=end+1;
            end=bound;

        }

        return step;
    }

}
