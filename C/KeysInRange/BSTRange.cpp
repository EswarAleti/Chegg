#include<stdio.h>
#include<stdlib.h>
//Tree node
struct tree_node
{
    int value;
    struct tree_node *left;
    struct tree_node *right;
};
//this function creates a new node with given data and returns the node
struct tree_node* create_node(int value)
{
    struct tree_node *new_node=(struct tree_node *)malloc(sizeof(struct tree_node));
    //assign value to node as passed value
    new_node->value=value;
    //make left of node is NULL
    new_node->left=NULL;
    //make right of node is NULL
    new_node->right=NULL;
    //return NULL
    return new_node;
}
//find_values() prints the keys in the range
void find_values(struct tree_node *node,int k1,int k2)
{
    //If node is empty then simple return
    if(node==NULL)
        return;
    //k1<node->value means there is a chance that left subtree of node may contains value in the range
    if(k1<node->value)
        find_values(node->left,k1,k2);
    //If value of data in given range then print it
    if(k1<=node->value && k2>=node->value)
        printf("%d ",node->value);
    //k2>node->value means there is a chance that right subtree of node may contains value in the range
    if(k2>node->value)
        find_values(node->right,k1,k2);
    //Note: left tree,print(value),right tree because i want to print nodes in ascending order
    //you can follow any order such as preorder, postorder. I followed Inorder
}
int main()
{
    //Creatig root node
    struct tree_node *root=(struct tree_node *)malloc(sizeof(struct tree_node));
    //These are inserted as per given tree in example
    root = create_node(20);
    root->left = create_node(8);
    root->right = create_node(22);
    root->left->left = create_node(4);
    root->left->right = create_node(12);
    //Function callng as per the example in question
    find_values(root,10,25);
    return 0;
}
