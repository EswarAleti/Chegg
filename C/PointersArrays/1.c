#include<stdio.h>
int main()
{
    int i;
    //array initialization
    int a[10]={1,2,3,4,5,6,7,8,9,10};
    printf("********Method 1*********\n");
    int *p1;
    // assigne base address of array a to p1
    // To print address we use %u to print content integer we use %d
    p1=&a[0];
    for(i=0;i<10;i++)
        printf("%u -> %d\n",p1+i,*(p1+i));
    printf("********Method 2*********\n");
    int *p2;
    // Here a is nothing but it is the base address of array a
    // Here we are assiging base address to pointer p
    p2=a;
    for(i=0;i<10;i++)
        printf("%u -> %d\n",p2+i,*(p2+i));
    printf("********Method 3*********\n");
    // a denotes the address, *a denotes the content
    for(i=0;i<10;i++)
        printf("%u -> %d\n",a+i,*(a+i));
    return 0;
}
