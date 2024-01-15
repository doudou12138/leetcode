public class EightTow_solution {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode vertureHead = new ListNode(-200,head);
        ListNode left = vertureHead;
        ListNode right = head.next;
        ListNode last = head;
        while(right!=null){
            if(right.val>last.val){
                right = right.next;
                last = last.next;
                left = left.next;
            }
            else{
                int val = last.val;
                while(right!=null&&right.val==val){
                    right = right.next;
                }
                left.next = right;
                last = right;
                if(right!=null){
                    right = right.next;
                }
            }
        }
        return vertureHead.next;
    }

}
