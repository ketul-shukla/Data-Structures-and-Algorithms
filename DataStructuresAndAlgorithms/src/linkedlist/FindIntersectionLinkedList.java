package linkedlist;

public class FindIntersectionLinkedList {

    static Node headA, headB;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public int intersectNode(Node headA, Node headB){
        int nodesA = countNodes(headA);
        int nodesB = countNodes(headB);
        if(nodesA > nodesB){
            headA = changeHead(headA, nodesA-nodesB);
        }else{
            headB = changeHead(headB, nodesB-nodesA);
        }
        while(headA != null && headB != null){
            if(headA == headB){
                return headA.data;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return -1;
    }

    public Node changeHead(Node head, int extraNodes){
        for(int i=0; i<extraNodes; i++){
            head = head.next;
        }
        return head;
    }

    public int countNodes(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args){
        FindIntersectionLinkedList findIntersection = new FindIntersectionLinkedList();
        Node firstA = new Node(1);
        Node secondA = new Node(2);
        Node thirdA = new Node(3);
        Node fourthA = new Node(4);

        Node firstB = new Node(5);
        Node secondB = new Node(6);

        headA = firstA;
        firstA.next = secondA;
        secondA.next = thirdA;
        thirdA.next = fourthA;

        headB = firstB;
        firstB.next = secondB;
        secondB.next = thirdA;

        System.out.println("The intersection point for linked lists is: " + findIntersection.intersectNode(headA, headB));
    }
}
