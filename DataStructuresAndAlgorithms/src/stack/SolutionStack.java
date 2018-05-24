package stack;

import java.util.Scanner;
import java.util.Stack;

public class SolutionStack {

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        Scanner scan = new Scanner(System.in);

        //Number of queries to process
        System.out.println("Enter Number of queries to process: ");
        int noOfQuery = scan.nextInt();

        /* Select Type of query:
        * 1. Push element to the stack
        * 2. Delete the element at the top of the stack
        * 3. Maximum in the stack
        * */
        for(int i=0; i<noOfQuery; i++){
            System.out.println("Select a query number: \n 1. Push element to the stack \n 2. Delete the element at the top of the stack \n 3. Maximum in the stack");
            int query = scan.nextInt();
            switch (query){
                case 1:
                    System.out.println("Enter data to be pushed: ");
                    int data = scan.nextInt();
                    stack.push(data);
                    if(maxStack.empty() || maxStack.peek() <= data){
                        maxStack.push(data);
                    }
                    break;
                case 2:
                    int poppedData = stack.pop();
                    if(poppedData == maxStack.peek()){
                        maxStack.pop();
                    }
                    break;
                case 3:
                    System.out.println("The maximum element is: " + maxStack.peek());
                    /*
                    Alternate method to find maximum:
                    int max = stack.pop();
                    while(!stack.isEmpty()){
                        if(stack.peek() > max){
                            max = stack.pop();
                        }else{
                            stack.pop();
                        }
                    }
                    */
                default:
                    break;
            }
        }
    }
}
