package stack;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

    public static void main(String[] args){
        String s = "";
        Stack<String> stack = new Stack<>();
        stack.push(s);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No. of operations to perform:");

        int noOfOperations = scan.nextInt();

        for(int i=0; i<noOfOperations; i++){
            System.out.println("Select operation to be performed: \n 1. Append string to the string. \n 2. Delete the last k characters. \n 3. Print the Kth character. \n 4. Undo the last operation.");
            int operation = scan.nextInt();

            switch (operation){
                case 1:
                    s = stack.peek();
                    System.out.println("Enter new string:");
                    String data = scan.next();
                    s = s.concat(data);
                    stack.push(s);
                    break;
                case 2:
                    s = stack.peek();
                    System.out.println("Enter no. of characters to delete:");
                    int charToDelete = scan.nextInt();
                    s = s.substring(0, s.length() - charToDelete);
                    stack.push(s);
                    break;
                case 3:
                    s = stack.peek();
                    System.out.println("Enter the character number to be printed:");
                    int printChar = scan.nextInt();
                    System.out.println(s.charAt(printChar-1));
                    break;
                case 4:
                    stack.pop();
                    break;
                default:
                    break;
            }

        }

    }
}
