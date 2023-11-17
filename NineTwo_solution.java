public class NineTwo_solution{
     class ListNode {
         int val;
         ListNode next;

         ListNode() {
         }

         ListNode(int val) {
             this.val = val;
         }

         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
     }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode beforeStart =null;
        ListNode last = head;
        if(left!=1){
            beforeStart = getStartNode(head,left-1);
            last = beforeStart.next;
        }

        ListNode now = last.next;
        int len=right-left;
        while(--len>=0){
            ListNode next = now.next;
            now.next=last;
            last = now;
            now=next;
        }

        if(beforeStart==null){
            head.next=now;
            return last;
        }else{
            beforeStart.next.next=now;
            beforeStart.next=last;
        }
        return head;

    }

    private ListNode getStartNode(ListNode head,int left){
        ListNode result = head;
        while(--left>0){
            result=result.next;
        }
        return result;
    }

}
