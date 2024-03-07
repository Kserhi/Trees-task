package app;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new DataProvider().getTree();

        System.out.print("Preorder traversal: ");
        tree.traversePreOrder(tree.root);
        System.out.print("\nInorder traversal: ");
        tree.traverseInOrder(tree.root);
        System.out.print("\nPostorder traversal: ");
        tree.traversePostOrder(tree.root);


    }
}
