package linkedlist;

public class CycleDetect {
  public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        ListNode temp1=head;
        if(head==null){
            return false;
        }
        else{
            try{
        do{
            temp=temp.next; //move only by one node
            temp1=temp1.next.next;//move by two node
        }while(temp!=temp1);
                return true;
            }
            catch(NullPointerException e){
                return false;
            }
            }
    }
}
