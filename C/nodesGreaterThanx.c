int numBig(const Node *t)
{
	if(t==null)
		return 0;
	leftCount = numBig(t->left);
	rightCount = numBig(t->right);
	if(t->data>100)
		return 1+leftCount+rightCount;
	return leftCount+rightCount;
}