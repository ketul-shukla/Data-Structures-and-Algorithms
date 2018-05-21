package linkedlist;

public class CompareLinkedList extends LinkedList {

    public static boolean compare(ListNode headA, ListNode headB){
        if(headA == null && headB == null){
            return true;
        }
        while(headA.data == headB.data){
            if(headA.next == null){
                if(headB.next == null){
                    return true;
                }else{
                    return false;
                }
            }
            headA = headA.next;
            headB =  headB.next;
        }
        return false;
    }

    public static void main(String[] args){
        CompareLinkedList compareListA = new CompareLinkedList();
        compareListA.add(3);
        compareListA.add(2);
        compareListA.add(1);

        CompareLinkedList compareListB = new CompareLinkedList();
        compareListB.add(3);
        compareListB.add(2);
        compareListB.add(1);

        System.out.print("The comparison result is: " + compare(compareListA.head, compareListB.head));
    }
}
