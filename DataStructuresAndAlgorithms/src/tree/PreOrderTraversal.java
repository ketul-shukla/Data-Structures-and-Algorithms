package tree;

import java.util.Stack;

public class PreOrderTraversal {

    TreeNode root;

    public void preOrderTraversal(TreeNode root){
        /* Recursive Approach
        * if(root != null){
        *   System.out.print(root.data + " ");
        *   preOrderTraversal(root.left);
        *   preOrderTraversal(root.right);
        * }
        * */
        if(root == null){
            System.out.println("Null");
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }

    public static void main(String[] args){
        PreOrderTraversal preOrder = new PreOrderTraversal();

        preOrder.root = new TreeNode(1);
        preOrder.root.left = new TreeNode(2);
        preOrder.root.right = new TreeNode(3);
        preOrder.root.left.left = new TreeNode(4);
        preOrder.root.left.right = new TreeNode(5);
        preOrder.root.right.left = new TreeNode(6);
        preOrder.root.right.right = new TreeNode(7);

        preOrder.preOrderTraversal(preOrder.root);
    }
}
