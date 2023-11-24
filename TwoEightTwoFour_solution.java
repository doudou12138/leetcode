import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TwoEightTwoFour_solution {
    public int countPairs(List<Integer> nums, int target) {
        sort(nums);

        int left=0;
        int right=nums.size()-1;
        int res=0;

        while(left<right){
            int left_value = nums.get(left);
            int max=target-left_value;

            while(nums.get(right)>=max&&right>left){
                --right;
            }
            if(right<=left){
                break;
            }

            res+=right-left;
            ++left;
        }

        return res;

    }

    private void sort(List<Integer> nums){
        quickSort(nums,0,nums.size()-1);
    }

    private void quickSort(List<Integer> nums,int start,int end){

        if(start>=end){
            return;
        }
        int standard = nums.get(start);
        int standard_index=start;

        int l=start;
        int r=end;
        while(l<r) {
            while (r > standard_index && nums.get(r) >= standard) {
                --r;
            }
            if (r <= standard_index) {
                break;
            }


            nums.set(standard_index, nums.get(r));
            nums.set(r, standard);
            standard_index = r;

            while (l < standard_index && nums.get(l) <= standard) {
                ++l;
            }
            if (l >= standard_index) {
                break;
            }
            nums.set(standard_index, nums.get(l));
            nums.set(l, standard);
            standard_index = l;
        }

        quickSort(nums,start,standard_index-1);
        quickSort(nums,standard_index+1,end);
    }

    public static void main(String[] args){
        TwoEightTwoFour_solution twoEightTwoFour_solution=new TwoEightTwoFour_solution();
//        Random random=new Random();
//        int times= random.nextInt()&31;
//        for(int i=0;i<times;i++){
//            List<Integer> list=new ArrayList<>();
//            int len=random.nextInt()&127;
//            for(int j=0;j<len;++j){
//                list.add(random.nextInt()&4095);
//            }
//            twoEightTwoFour_solution.sort(list);
//
//            System.out.println(list+String.valueOf(isOrdered(list)));
//
//        }
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(1);
        twoEightTwoFour_solution.countPairs(list,2);
    }


    private static boolean isOrdered(List<Integer> nums){
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                return false;
            }
        }
        return true;
    }

}
