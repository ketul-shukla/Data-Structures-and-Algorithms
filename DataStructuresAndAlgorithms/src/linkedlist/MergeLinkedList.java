package linkedlist;

public class MergeLinkedList extends LinkedList {

    public static ListNode merge(ListNode headA, ListNode headB){
        if(headA == null){
            return headB;
        }
        ListNode currentA = headA;
        ListNode temp = null;
        while(headB != null){
            if(currentA.data > headB.data) {
                temp = headB;
                headB = headB.next;
                temp.next = currentA;
                headA = temp;
                currentA = headA;
            }else{
                while(currentA.next != null && currentA.next.data < headB.data){
                    currentA = currentA.next;
                }
                temp = headB;
                headB = headB.next;
                temp.next = currentA.next;
                currentA.next = temp;
            }
        }
        return headA;
    }

    public static void main(String[] args){
        MergeLinkedList mergeListA = new MergeLinkedList();
        mergeListA.add(6);
        mergeListA.add(5);
        mergeListA.add(3);
        mergeListA.add(1);

        MergeLinkedList mergeListB = new MergeLinkedList();
        mergeListB.add(7);
        mergeListB.add(4);
        mergeListB.add(2);

        mergeListA.printList(merge(mergeListA.head, mergeListB.head));
    }
}
