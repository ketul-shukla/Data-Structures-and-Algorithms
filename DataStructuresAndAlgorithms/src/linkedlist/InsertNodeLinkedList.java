package linkedlist;

public class InsertNodeLinkedList extends LinkedList{

    public void insertAtHead(int data){
      ListNode newNode = new ListNode(data);
      newNode.next = head;
      head = newNode;
    }

    public void insertAtTail(int data){
        if(head == null){
            insertAtHead(data);
        }else{
            ListNode newNode = new ListNode(data);
            ListNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertAtPosition(int data, int position){
        if(head == null || position == 0){
            insertAtHead(data);
        }else{
            ListNode newNode = new ListNode(data);
            ListNode current = head;
            for(int i=1; i<position; i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public static void main(String[] args){
        InsertNodeLinkedList insertNode = new InsertNodeLinkedList();
        insertNode.add(3);
        insertNode.add(2);
        insertNode.add(1);

        insertNode.insertAtPosition(6,1);
        insertNode.insertAtHead(4);
        insertNode.insertAtTail(5);

        insertNode.printList();

    }
}
