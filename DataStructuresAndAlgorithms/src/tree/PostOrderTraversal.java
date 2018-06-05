package tree;

import java.util.Stack;

public class PostOrderTraversal {

    TreeNode root;

    public void postOrderTraversal(TreeNode root){

        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode previous = null;
        while(!stack.isEmpty()){
            TreeNode current = stack.peek();
            if(previous == null || previous.left == current || previous.right == current){
                if(current.left != null){
                    stack.push(current.left);
                }else if(current.right != null){
                    stack.push(current.right);
                }else{
                    stack.pop();
                    System.out.print(current.data + " ");
                }
            }else if(current.left == previous){
                if(current.right != null){
                    stack.push(current.right);
                }else{
                    stack.pop();
                    System.out.print(current.data + " ");
                }
            }else if(current.right == previous){
                stack.pop();
                System.out.print(current.data + " ");
            }
            previous = current;
        }
    }

    public static void main(String[] args){
        PostOrderTraversal postOrder = new PostOrderTraversal();

        postOrder.root = new TreeNode(1);
        postOrder.root.left = new TreeNode(2);
        postOrder.root.right = new TreeNode(3);
        postOrder.root.left.left = new TreeNode(4);
        postOrder.root.left.right = new TreeNode(5);
        postOrder.root.right.left = new TreeNode(6);
        postOrder.root.right.right = new TreeNode(7);

        postOrder.postOrderTraversal(postOrder.root);
    }
}
