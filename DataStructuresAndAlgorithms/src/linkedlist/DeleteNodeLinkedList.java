package linkedlist;

public class DeleteNodeLinkedList extends LinkedList {

    public void deleteAtPosition(int position){
        if(position == 0){
            head = head.next;
        }else{
            ListNode current = head;
            for(int i=1; i<position; i++){
                current = current.next;
            }
            ListNode temp = current.next;
            current.next = temp.next;
        }
    }

    public static void main(String[] args){
        DeleteNodeLinkedList deleteNode = new DeleteNodeLinkedList();
        deleteNode.add(3);
        deleteNode.add(2);
        deleteNode.add(1);

        System.out.println("List before deleting a node:");
        deleteNode.printList(deleteNode.head);

        deleteNode.deleteAtPosition(1);
        System.out.println("List after deleting a node at specific position:");
        deleteNode.printList(deleteNode.head);
    }
}
