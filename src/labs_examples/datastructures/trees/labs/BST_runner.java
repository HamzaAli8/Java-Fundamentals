package labs_examples.datastructures.trees.labs;

public class BST_runner {

    public static void main(String[] args) {

        TreeNode bst = new TreeNode(80);

        bst.insert(120);
        bst.insert(100);
        bst.insert(110);
        bst.insert(20);
        bst.insert(30);
        bst.insert(40);
        bst.insert(140);
        bst.insert(150);
        bst.insert(130);
        bst.insert(90);
        bst.insert(50);
        bst.insert(60);
        bst.insert(10);

        bst.in_order();
        bst.post_order();

    }
}
