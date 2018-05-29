package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    TreeNode root;

    public void levelOrderTraversal(TreeNode root){
        if(root == null){
            System.out.print("Null");
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null){
                queue.offer(temp.left);
            }
            if(temp.right != null){
                queue.offer(temp.right);
            }
        }
    }

    public static void main(String[] args){
        LevelOrderTraversal levelOrder = new LevelOrderTraversal();

        levelOrder.root = new TreeNode(1);
        levelOrder.root.left = new TreeNode(2);
        levelOrder.root.right = new TreeNode(3);
        levelOrder.root.left.left = new TreeNode(4);
        levelOrder.root.left.right = new TreeNode(5);
        levelOrder.root.right.left = new TreeNode(6);
        levelOrder.root.right.right = new TreeNode(7);

        levelOrder.levelOrderTraversal(levelOrder.root);
    }
}
