package tree;

public class InsertNodeInBST {

    TreeNode root;

    public TreeNode insertNode(TreeNode root, int value){
        if(root == null){
            TreeNode nodeData = new TreeNode(value);
            root = nodeData;
            return root;
        }
        if(value < root.data){
            root.left = insertNode(root.left, value);
        }else if(value > root.data){
            root.right = insertNode(root.right, value);
        }
        return root;
    }

    public void printTree(TreeNode root){
        if(root != null){
            printTree(root.left);
            System.out.print(root.data + " ");
            printTree(root.right);
        }
    }

    public static void main(String args[]){
        InsertNodeInBST insertNodeBST = new InsertNodeInBST();

        insertNodeBST.root = new TreeNode(100);
        insertNodeBST.root.left = new TreeNode(20);
        insertNodeBST.root.right = new TreeNode(500);
        insertNodeBST.root.left.left = new TreeNode(10);
        insertNodeBST.root.left.right = new TreeNode(30);

        insertNodeBST.printTree(insertNodeBST.insertNode(insertNodeBST.root, 40));

    }
}
