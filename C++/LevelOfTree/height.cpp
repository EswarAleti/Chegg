#include <iostream>
using namespace std;
 
// Strcuture for node of a Binary Tree
struct node
{
	int data;
    struct node *left;
    struct node *right;
};
 
// Recursive method to find levels of bianryTree
int depth(node *root)
{
	int left,right;
    // If root null returns 0 this is base case
    if (root == NULL)
        return 0;
 
    // Apply recursion on left and right subtrees of binary tree
    left = depth(root->left);
    right = depth(root->right);
    
    //If left > right return left+1. Here 1 is added because a new level is found
    if(left>right)
    	return left+1;
    else
    	return right+1;
}
 
// Function to create a tree node
node* newNode(int data)
{
    node *temp = new node;
    temp->data = data;
    temp->left = NULL;
    temp->right = NULL;
    return temp;
}
 
// Driver program
int main()
{
    // Creation of sample binary tree
    node *root = newNode(1);
    root->left = newNode(2);
    root->right = newNode(3);
    root->left->right = newNode(4);
    root->right->left= newNode(5);
	 
    cout << "Number of levels in tree is " << depth(root);
    return 0;
}
