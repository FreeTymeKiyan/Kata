class Traversal12 {
	public static void traverse(Node root) {
		inOrder(root);
		System.out.println("---");
		preOrder(root);
		System.out.println("---");
		postOrder(root);
	}

	public static void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.leftNode());
		System.out.println(root.getNodeValue());
		inOrder(root.rightNode());
	}

	public static void preOrder(Node root) {
		if(root == null) return;
		System.out.println(root.getNodeValue());
		preOrder(root.leftNode());
		preOrder(root.rightNode());
	}

	public static void postOrder(Node root) {
		if(root == null) return;
		postOrder(root.leftNode());
		postOrder(root.rightNode());
		System.out.println(root.getNodeValue());
	}
}
