public class Demo
{
	public static void main(String[] args) 
	{
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>( );
		bst.insert(10);
		bst.insert(6);
		bst.insert(13);
		bst.insert(12);	
		bst.insert(5);
		bst.insert(14);
		bst.insert(11);
		bst.insert(7);
		/*
				10
			   /  \
			  6    13
			 / \   / \
			5   7 12 14
				  /
				 11
		*/
		bst.printInLevelOrder();
	}
}