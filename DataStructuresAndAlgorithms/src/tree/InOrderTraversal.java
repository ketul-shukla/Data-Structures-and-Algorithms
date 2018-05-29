package tree;

import java.util.Stack;

public class InOrderTraversal {

    TreeNode root;

    public void inOrderTraversal(TreeNode root){
        /*Recursive Approach:
        * if(root != null){
        *   inOrderTraverasl(root.left);
        *   System.out.print(root.data + " ");
        *   inOrderTraversal(root.right);
        * }
        * */
        if(root == null){
            System.out.print("Null");
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        boolean done = false;
        while(!done){
            if(current != null){
                stack.push(current);
                current = current.left;
            }else{
                if(stack.isEmpty()){
                    done = true;
                }else{
                    current = stack.pop();
                    System.out.print( current.data + " ");
                    current = current.right;
                }
            }
        }
    }

    public static void main(String[] args){
        InOrderTraversal inOrder = new InOrderTraversal();

        inOrder.root = new TreeNode(1);
        inOrder.root.left = new TreeNode(2);
        inOrder.root.right = new TreeNode(3);
        inOrder.root.left.left = new TreeNode(4);
        inOrder.root.left.right = new TreeNode(5);
        inOrder.root.right.left = new TreeNode(6);
        inOrder.root.right.right = new TreeNode(7);

        inOrder.inOrderTraversal(inOrder.root);
    }
}
