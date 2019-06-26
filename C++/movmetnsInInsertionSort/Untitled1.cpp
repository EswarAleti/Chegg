#include<stdio.h>
int arr[5]={5,2,1,4,3};
void mov_element(int *ptrElement)

{

int i_val;

for ( i_val = * ( arr + *ptrElement ) ; *ptrElement && *( arr + *ptrElement -1) > i_val ; (*ptrElement)--)

* ( arr + *ptrElement ) = *( arr+*ptrElement -1 ) ; /* move element down */

* ( arr + *ptrElement ) = i_val; /* insert element */

 }
int main()
{
	int i;
	int n=0;
	for(n=0;n<5;n++)
		mov_element(&n);
	for(i=0;i<5;i++)
		printf("%d ",arr[i]);
}
