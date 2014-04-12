class Traversal4 {
    public static void traverse(Node root) {
        inOrder(root);
        System.out.println("---");
        preOrder(root);
        System.out.println("---");
        postOrder(root);
        System.out.println("---");
    }

    private static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.leftNode());
        System.out.println(root.getNodeValue());
        inOrder(root.rightNode());
    }

    private static void preOrder(Node root) {
        if(root == null) return;
        System.out.println(root.getNodeValue());
        preOrder(root.leftNode());
        preOrder(root.rightNode());
    }

    private static void postOrder(Node root) {
        if(root == null) return;
        postOrder(root.leftNode());
        postOrder(root.rightNode());
        System.out.println(root.getNodeValue());
    }
}
