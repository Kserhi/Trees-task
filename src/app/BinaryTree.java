package app;

class BinaryTree {

    Node root;


    BinaryTree() {
        root = null;
    }


    void insert(int key) {
        root = insertKey(root, key);
    }

    // Вставляємо ключ/вузол в дерево
    Node insertKey(Node root, int key) {
        // Повертаємо новий вузол, якщо дерево порожнє
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Переходимо в потрібне місце та вставляємо вузол
        if (key < root.key)
            root.left = insertKey(root.left, key);
        else if (key > root.key)
            root.right = insertKey(root.right, key);

        return root;
    }



    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.key);
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.key);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.key);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}
