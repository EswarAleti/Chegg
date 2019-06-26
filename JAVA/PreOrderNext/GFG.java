
// Java program to demonstrate insert operation  
// in binary search tree with parent pointer  
class GFG {  
  
static class Node  
{  
    int key;  
    Node left, right, parent;  
} 
  
// A utility function to create a new BST Node  
static Node newNode(int item)  
{  
    Node temp = new Node();  
    temp.key = item;  
    temp.left = null; 
    temp.right = null;  
    temp.parent = null;  
    return temp;  
}  
  
// A utility function to do inorder traversal of BST  
static Node preorderNext(Node node) 
{
    //If node contains left child then return left child
    //because in preorder traversal after parent we visit left node
    if(node.left!=null)
        return node.left;
    //if node contains only right child then return right child
    else if(node.right!=null)
        return node.right;
    //If the node is leaf node
    else
    {
        //Get parent of node
        Node parent = node.parent;
        //if node is the left child of parent then return right child of parent
        if(parent.left==node && parent.right!=null)
            return parent.right;
        //if node is right child of parent
        else
        {
            //iterate until preorder successor found
            //for that it should be present in left subtree of any node
            //And parent should contain right child
            while(parent.left!=node || parent.right==null)
            {
                //go to above nodes
                node=parent;
                parent=parent.parent;
            }
            //if right child is not null then return right child of parent
            if(parent.right!=null)
                return parent.right;
        }
    }
    //If it is the last node of preorder then return null
    return null;
}  
  
/* A utility function to insert a new Node with  
given key in BST */
static Node insert(Node node, int key)  
{  
    /* If the tree is empty, return a new Node */
    if (node == null) return newNode(key);  
  
    /* Otherwise, recur down the tree */
    if (key < node.key)  
    {  
        Node lchild = insert(node.left, key);  
        node.left = lchild;  
  
        // Set parent of root of left subtree  
        lchild.parent = node;  
    }  
    else if (key > node.key)  
    {  
        Node rchild = insert(node.right, key);  
        node.right = rchild;  
  
        // Set parent of root of right subtree  
        rchild.parent = node;  
    }  
  
    /* return the (unchanged) Node pointer */
    return node;  
}  
  
// Driver Program to test above functions  
public static void main(String[] args)  
{  
    /* Let us create following BST  
            50  
        /     \  
        30     70  
        / \ / \  
    20 40 60 80 */
    Node root = null;  
    root = insert(root, 50);  
    insert(root, 30);  
    insert(root, 20);  
    insert(root, 40);  
    insert(root, 70);  
    insert(root, 60);  
    insert(root, 80);  
    System.out.println(preorderNext(root).key);
    System.out.println(preorderNext(root.left).key);
    System.out.println(preorderNext(root.left.left).key);
    System.out.println(preorderNext(root.left.right).key);
    System.out.println(preorderNext(root.right).key);
    System.out.println(preorderNext(root.right.left).key);
    //System.out.println(preorderNext(root.right.right).key);
} 
} 