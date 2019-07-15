#include<stdio.h>
#include<stdlib.h>

int readInitialLength()
{
	//Take input from user and return it
	int length;
	printf("Enter the length: ");
	scanf("%d",&length);
	return length;
}

int* createAndFill(int length)
{
	int i;
	//create an array dynamically
	int *array=(int *)malloc(sizeof(int)*length);
	printf("Enter %d number of elements into array: ",length);
	//Take inputs from user and insert into array
	for(i=0;i<length;i++)
	{
		scanf("%d",(array+i));
	}
	//return array
	return array;
}

void printArray(int *array, int length)
{
	int i;
	printf("Elements of array is: ");
	//Iterate over array and print the result
	for(i=0;i<length;i++)
	{
		printf("%d ",*(array+i));
	}
}

int menu()
{
	//Print the menu and take choice from user and return it
	int choice;
	printf("\n1. Sort the array\n");
	printf("2. add item\n");
	printf("3. print If found\n");
	printf("4. quit\n");
	printf("your choice: ");
	scanf("%d",&choice);
	return choice;
}


void sortArray(int* array, int length)
{
	//Bubble sort
	int i,j;
	for(i=0;i<length;i++)
	{
		for(j=i+1;j<length;j++)
		{
			if(*(array+i)>*(array+j))
			{
				int temp=*(array+i);
				*(array+i)=*(array+j);
				*(array+j)=temp;
			}
		}
	}
}

int* addItem(int *length, int *array)
{
	int i;
	//Increment the length
	*length=*length+1;	
	//Create a new array dynamically
	int *newArray=(int *)malloc(sizeof(int)*(*length));
	//Copy the contents of old array to new array
	for(i=0;i<*length-1;i++)
	{
		*(newArray+i)=*(array+i);
	}
	//Take a number from user and insert into new array
	int num;
	printf("Enter a new number: ");
	scanf("%d",&num);
	*(newArray+i)=num;
	//cleanup the array
	free(array);
	//return new array
	return newArray;
}

int readValue()
{
	//read value from the user and return it
	int val;
	printf("Enter an integer: ");
	scanf("%d",&val);
	return val;
}

void printIfFound(int value, int* array, int length)
{
	int i;
	//Iterate over array and print if element found
	for(i=0;i<length;i++)
	{
		if(*(array+i)==value)
		{
			printf("%d found in array at %d index",value,i);
			return;	
		}	
	}
	//We came here if element was not in array
	printf("%d is not found in the array",value);	
}

void cleanUp(int* array)
{
	//clean the array from memory
	free(array);
}

int main()
{
	int * array = NULL;
	int length, choice, value;
	
	length = readInitialLength();
	array = createAndFill(length);
	printArray(array, length);
	
	do
	{
		choice = menu();
		
		switch(choice)
		{
			case 1: sortArray(array, length);
			        printArray(array, length);
					break;
			
			case 2: array = addItem(&length, array);
			        printArray(array, length);
					break;
			
			case 3: value = readValue();
					printIfFound(value, array, length);
					break;
		}
	}while(choice != 4);
	
	cleanUp(array);
	array = NULL;
	return 0;
}
