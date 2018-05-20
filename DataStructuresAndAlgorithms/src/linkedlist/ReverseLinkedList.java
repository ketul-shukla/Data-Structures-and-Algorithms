package linkedlist;

public class ReverseLinkedList extends LinkedList {

    public void reverse(){
        if(head.next == null){
            return;
        }else{
            ListNode current = head;
            ListNode previous = null;
            ListNode next = current.next;
            while(next != null){
                current.next = previous;
                previous = current;
                current = next;
                next = next.next;
            }
            current.next = previous;
            head = current;
        }
    }

    public static void main(String[] args){
        ReverseLinkedList reverseList = new ReverseLinkedList();
        reverseList.add(1);
        reverseList.add(2);
        reverseList.add(3);

        reverseList.reverse();
        reverseList.printList();
    }
}
