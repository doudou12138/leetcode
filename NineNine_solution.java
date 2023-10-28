import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class NineNine_solution {
    public class TreeNode {
      int val;
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

    private List<List<TreeNode>> decreaseNum = new ArrayList<>();

    public void recoverTree(TreeNode root) {
        TreeNode last = new TreeNode(Integer.MIN_VALUE);
        search(root,last);
        if(decreaseNum.size()==1){
            List<TreeNode> nodes = decreaseNum.get(0);
            int mid=nodes.get(0).val;
            nodes.get(0).val=nodes.get(1).val;
            nodes.get(1).val=mid;
        }else{
            TreeNode node1 = decreaseNum.get(0).get(0);
            TreeNode node2 = decreaseNum.get(1).get(1);
            int mid=node1.val;
            node1.val=node2.val;
            node2.val=mid;
        }
    }

    public TreeNode search(TreeNode node, TreeNode last){
        if(node==null){
            return last;
        }

        last = search(node.left,last);
        if(node.val<last.val){
            List<TreeNode> nodes = new ArrayList<>();
            nodes.add(last);
            nodes.add(node);
            decreaseNum.add(nodes);
        }
        last = node;
        last = search(node.right,last);
        return last;
    }

}
