public class Main {
    public static void main(String[] args) {
        Node root = new Node(2);
        Node node1 = new Node(7);
        Node node2 = new Node(2);
        Node node3 = new Node(6);
        Node node4 = new Node(5);
        Node node5 = new Node(11);
        Node node6 = new Node(5);
        Node node7 = new Node(9);
        Node node8 = new Node(4);
        root.setLeftNode(node1);
        node1.setLeftNode(node2);
        node1.setRightNode(node3);
        node3.setLeftNode(node4);
        node3.setRightNode(node5);
        root.setRightNode(node5);
        node6.setRightNode(node7);
        node7.setLeftNode(node8);

        Traversal.traverse(root);
    }
}
