package tree;

public class BinaryTreeBasic {
    TreeNode root;

    public static void main(String[] args){
        BinaryTreeBasic binaryTree = new BinaryTreeBasic();

        binaryTree.root = new TreeNode(1);
        binaryTree.root.left = new TreeNode(2);
        binaryTree.root.right = new TreeNode(3);
    }
}
