import java.util.*;
public class BinarySearchTree<E extends Comparable<? super E>> 
{
	private Node root;
	public BinarySearchTree()
	{
		root = null;
	}
	public void printInLevelOrder()
	{
		printInLevelOrder(root);
	}
	private void printInLevelOrder(Node current)
	{
		//If tree is empty then simply return
		if(current==null)
			return;
		//Queue which is used for levelOrder Traversal
		//in Queue add(),size(),remove() and peek() takes O(1) time
		Queue<Node> queue =new LinkedList<Node>();
		//add current node to queue O(1) time
		queue.add(current);
		//Iterate until queue is empty
		while(queue.size()>0)
		{
			//Create a node with front of the queue O(1) time
			//Here treeNode is a parent node
			Node treeNode = queue.peek();
			//Print data of parent node O(1) time
			System.out.print(treeNode.data + " "); 
           	//Remove parent node from queue O(1) time
           	queue.remove();
           	//Go to left subtree and add the node to queue if exist O(1) time 
            if(treeNode.left != null) 
                queue.add(treeNode.left);
            //Go to right subtree and add the node to queue if exist O(1) time
            if(treeNode.right != null) 
                queue.add(treeNode.right); 
		}
		//Since we are adding n nodes to the queue
		//For each node we are taking O(1) time in the while loop
		//Hence the compplexity O(n)*O(1) = O(n)
		//Where n is the number of nodes in the tree
	}
	public void printTree()
	{
		printTree(root);
	}
	private void printTree(Node current)
	{
		if(current != null)
		{
			String content = "Current:"+current.data.toString();
			if(current.left != null)
			{
				content += "; Left side:"+current.left.data.toString();
			}
			if(current.right != null)
			{
				content += "; Right side:"+current.right.data.toString();
			}
			System.out.println(content);
			printTree(current.left);
			printTree(current.right);
		}
	}
	public void printInOrder()
	{
		System.out.print("In order:");
		printInOrder(root);
		System.out.println();
	}
	private void printInOrder(Node current)
	{
		if(current != null)
		{
			printInOrder(current.left);
			System.out.print(current.data.toString()+",");
			printInOrder(current.right);
		}
	}
	public boolean contains(E val)
	{
		Node result = findNode(val, root);
		if(result != null)
			return true;
		else
			return false;
	}
	private Node findNode(E val, Node current)
	{
		//base cases
		if(current == null)
			return null;
		if(current.data.equals(val))
			return current;
		//recursive cases
		int result = current.data.compareTo(val);
		if(result < 0)
			return findNode(val, current.right);
		else
			return findNode(val, current.left);
	}
	public E findMin()
	{
		Node result = findMin(root);
		if(result == null)
			return null;
		else
			return result.data;
	}
	private Node findMin(Node current)
	{
		while(current.left != null)
		{
			current = current.left;
		}
		return current;
	}
	public E findMax()
	{
		Node current = root;
		while(current.right != null)
		{
			current = current.right;
		}
		return current.data;
	}
	public void insert(E val)
	{
		root = insertHelper(val, root);
	}
	public Node insertHelper(E val, Node current)
	{
		if(current == null)
		{
			return new Node(val);
		}
		int result = current.data.compareTo(val);
		if(result < 0)
		{
			current.right = insertHelper(val, current.right);
		}
		else if(result > 0)
		{
			current.left = insertHelper(val, current.left);
		}
		else//update
		{
			current.data = val;
		}
		return current;
	}
	public void remove(E val)
	{
		root = removeHelper(val, root);
	}
	private Node removeHelper(E val, Node current)
	{
		if(current.data.equals(val))
		{
			if(current.left == null && current.right == null)//no children
			{
				return null;
			}
			else if(current.left != null && current.right != null)//two children
			{
				Node result = findMin(current.right);
				result.right = removeHelper(result.data, current.right);
				result.left = current.left;
				return result;
			}
			else//one child
			{
				return (current.left != null)? current.left : current.right;
			}
		}
		int result = current.data.compareTo(val);
		if(result < 0)
		{
			current.right = removeHelper(val, current.right);
		}
		else if(result > 0)
		{
			current.left = removeHelper(val, current.left);
		}
		return current;
	}
	private class Node
	{
		E data;
		Node left, right;
		public Node(E d)
		{
			data = d;
			left = null;
			right = null;
		}
	}
}