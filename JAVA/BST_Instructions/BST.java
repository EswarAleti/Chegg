class Node{
	int key;
	Node left;
	Node right;
	Node(int k){
		this.key=k;
		this.left=this.right=null;
	}
	void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.key);
		inorder(root.right);
	}
}
class Problem3{
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(2);
		root.right = new Node(7);
		root.left.right = new Node(4);
		root.right.left = new Node(6);
		root.right.right = new Node(8);
		root.left.left = new Node(1);
		root.left.right.left = new Node(3);
		/* Replace 7 with 8*/
		/* Procedure 1*/
		root.right.key = root.right.right.key;
		root.right.right=null;
		/* Procedure 2*/
		//root.right.right.left = root.right.left;
		//root.right = root.right.right;
		/* Replace 7 with 6*/
		/* Procedure 1*/
		//root.right.key = root.right.left.key;
		//root.right.left=null;
		/* Procedure 2*/
		//root.right.left.right = root.right.right;
		//root.right = root.right.left;
		root.inorder(root);
	}
}