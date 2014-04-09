class Traversal1 {
    public static void traverse(Node root) {
        InOrder(root);
        System.out.println("---");
        PreOrder(root);
        System.out.println("---");
        PostOrder(root);
        System.out.println("---");
    }

    private static void InOrder(Node root) {
        if(root == null) return;
        InOrder(root.leftNode());
        System.out.println(root.getNodeValue());
        InOrder(root.rightNode());
    }

    private static void PreOrder(Node root) {
        if(root == null) return;
        System.out.println(root.getNodeValue());
        PreOrder(root.leftNode());
        PreOrder(root.rightNode());
    }

    private static void PostOrder(Node root) {
        if(root == null) return;
        PostOrder(root.leftNode());
        PostOrder(root.rightNode());
        System.out.println(root.getNodeValue());
    }
}
