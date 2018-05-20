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

        deleteNode.deleteAtPosition(1);
        deleteNode.printList();
    }
}
