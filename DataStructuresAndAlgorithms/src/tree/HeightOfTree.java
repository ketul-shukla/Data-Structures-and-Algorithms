package tree;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfTree {

    TreeNode root;

    public int calculateHeight(TreeNode root){
        int height = 0;
        if(root == null){
            return height;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp != null){
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }else{
                height++;
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            }
        }
        return height;
    }

    public static void main(String[] args){
        HeightOfTree heightOfTree = new HeightOfTree();

        heightOfTree.root = new TreeNode(1);
        heightOfTree.root.left = new TreeNode(2);
        heightOfTree.root.right = new TreeNode(3);
        heightOfTree.root.left.left = new TreeNode(4);
        heightOfTree.root.left.right = new TreeNode(5);
        heightOfTree.root.right.left = new TreeNode(6);
        heightOfTree.root.right.right = new TreeNode(7);

        System.out.print("Height of tree is: " + heightOfTree.calculateHeight(heightOfTree.root));
    }

}
