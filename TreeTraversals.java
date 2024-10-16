class Node{
	int data;
	Node left,right;
	public Node(int data){
		this.data = data;
	}
}
public class TreeTraversals{
	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		System.out.println("\nPre-Order Traversal : ");
		preOrder(root);

		System.out.println("\nIn-Order Traversal  : ");
		inOrder(root);

		System.out.println("\nPost-Order Traversal : ");
		postOrder(root);
	}
	public static void preOrder(Node root){
		if(root == null)return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void inOrder(Node root){
		if(root == null)return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public static void postOrder(Node root){
		if(root == null)return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
}