/*
验证二叉搜索树
 */

public class NineEight_solution {


    public class TreeNode { int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    boolean minimum=false;
    boolean maximum = false;

    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.val==Integer.MAX_VALUE){
            maximum=true;
        }else if(root.val==Integer.MIN_VALUE){
            minimum=true;
        }
        return check(root.left,root.val,Integer.MIN_VALUE)&&check(root.right,Integer.MAX_VALUE,root.val);
    }




    private boolean check(TreeNode root,int max,int min){
        if(root==null){
            return true;
        }else{
            if(root.val>=max){
                if(max==Integer.MAX_VALUE){
                    if(maximum){
                        return false;
                    }else{
                        maximum=true;
                    }
                }else{
                    return false;
                }
            }else if(root.val<=min){
                if(min==Integer.MIN_VALUE){
                    if(minimum){
                        return false;
                    }else{
                        minimum=true;
                    }
                }else{
                    return false;
                }
            }
            return check(root.left,root.val,min)&&check(root.right,max,root.val);
        }
    }



}
