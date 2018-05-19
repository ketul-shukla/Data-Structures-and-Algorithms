package linkedlist;

public class LinkedList {
    ListNode head;

    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            next = null;
        }
    }

    public void printList(){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public void add(int data){
        ListNode node = new ListNode(data);
        node.next =  head;
        head = node;
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);

        linkedList.printList();
        /*
            A brute force method to first create the node and then connect them:

            linkedList.head = new ListNode(1);
            ListNode second = new ListNode(2);
            ListNode third = new ListNode(3);

            linkedList.head.next = second;
            second.next = third;
        */
    }
}
