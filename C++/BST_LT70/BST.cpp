#include<iostream>
//Folowing macros for rand()
#include<cstdlib>
#include <ctime>

using namespace std;

class BST
{
    struct 	btNode
    {
        int data;
        btNode* left;
        btNode* right;
    };

    btNode* bst_root;
	size_t count=0;

    btNode* insert(int x, 	btNode* bst_root)
    {
        if(bst_root == NULL)
        {
            bst_root = new 	btNode;
            bst_root->data = x;
            bst_root->left = bst_root->right = NULL;
        }
        else if(x < bst_root->data)
            bst_root->left = insert(x, bst_root->left);
        else if(x > bst_root->data)
            bst_root->right = insert(x, bst_root->right);
        return bst_root;
    }

    void inorder(btNode* bst_root)
    {
        if(bst_root == NULL)
            return;
        inorder(bst_root->left);
        cout << bst_root->data << " ";
        inorder(bst_root->right);
    }
    size_t countLT70(btNode* bst_root)
    {
    	if(bst_root != NULL)
    	{
	        //Go to left most child of tree and from there search for data < 70
			countLT70(bst_root->left);
			//If data<70 then only increment the count and goto right subtree else stop
			//Here we will traverse right subtree iff data<70 by this condition we will not visit nodes unnecessarily
	        if(bst_root->data < 70)
	        {
	        	count++;
	        	countLT70(bst_root->right);
	    	}
	        return count;
    	}
	}

public:
    BST()
    {
        bst_root = NULL;
    }

    void insert(int x)
    {
        bst_root = insert(x, bst_root);
    }

    void display()
    {
        inorder(bst_root);
        //Function  call for cuuntLt70()
        cout << "\nNumber of nodes less than 70 in BST is :" << countLT70(bst_root) << endl;
    }

};

int main()
{
    BST tree;
    srand(time(NULL));
    //Using random i have insert elements into BST
    for(int i=0;i<10;i++)
    	tree.insert(rand()%100);
    tree.display();
}

