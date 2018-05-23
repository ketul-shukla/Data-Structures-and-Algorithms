package linkedlist;

public class RemoveDuplicatesLinkedList extends LinkedList {

    public void removeDuplicateNodes(){
           ListNode current = head;
           while(current.next != null){
               if(current.data == current.next.data){
                   current.next = current.next.next;
               }else{
                   current = current.next;
               }
           }
    }

    public static void main(String[] args){
        RemoveDuplicatesLinkedList removeDuplicate = new RemoveDuplicatesLinkedList();
        removeDuplicate.add(3);
        removeDuplicate.add(2);
        removeDuplicate.add(2);
        removeDuplicate.add(1);

        System.out.println("List before deleting duplicate node:");
        removeDuplicate.printList(removeDuplicate.head);

        System.out.println("List before deleting duplicate node:");
        removeDuplicate.removeDuplicateNodes();
        removeDuplicate.printList(removeDuplicate.head);
    }
}
