package linkedlist;

import java.util.ArrayList;

public class DetectCycleLinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public boolean cycleDetect(Node headNode){
        if(headNode == null){
            return false;
        }
        ArrayList<Node> checkList = new ArrayList<>();
        while(head != null){
            if(checkList.contains(headNode)){
                return true;
            }
            checkList.add(headNode);
            headNode = head.next;
        }
        return false;
    }

    public static void main(String[] args){
        DetectCycleLinkedList detectCycle = new DetectCycleLinkedList();
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        detectCycle.head = first;
        first.next = second;
        second.next = third;
        third.next =  fourth;
        fourth.next = detectCycle.head;


        System.out.println("The linked contains cycle: " + detectCycle.cycleDetect(detectCycle.head));
    }
}
