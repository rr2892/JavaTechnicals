package TreesAndGraphs;

public class TreeNode {
    int value;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int value){
        this.value = value;
    }

    private void visit(TreeNode node){
        System.out.println(node.value);
    }

    public void inOrderTraversal(TreeNode node){
        if(node != null){
            inOrderTraversal(node.leftChild);
            visit(node);
            inOrderTraversal(node.rightChild);
        }
    }

    public void preOrderTraversal(TreeNode node){
        if(node != null){
            visit(node);
            preOrderTraversal(node.leftChild);
            preOrderTraversal(node.rightChild);
        }
    }

    public void postOrderTraversal(TreeNode node){
        if(node != null){
            postOrderTraversal(node.leftChild);
            postOrderTraversal(node.rightChild);
            visit(node);
        }
    }
}
