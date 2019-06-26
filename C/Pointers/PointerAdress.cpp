#include<stdio.h>
int main()
{
	int whole_number,*int_ptr;
	//assign integer pointer to whole numer
	int_ptr=&whole_number;
	float decimal,*float_ptr;
	//assign float pointer to decimal number
	float_ptr=&decimal;
	char character,*char_ptr;
	//assign character pointer to character
	char_ptr=&character;
	
	//Inputs from user
	printf("Please, enter a whole number (without a decimal point): ");
	scanf("%d",&whole_number);
	printf("Please enter a decimal number: ");
	scanf("%f",&decimal);
	printf("Please, enter a character: ");
	//Here we are taking input two times becasue first character takes \n as input
	scanf("%c%c",&character,&character);
	
	//Printing outputs. %p is denotes the address.
	printf("\nThe whole number enterd is %d.\n",*int_ptr);
	printf("The address of %d is %p.\n",*int_ptr,int_ptr);
	printf("\nThe deimal number enterd is %f.\n",*float_ptr);
	printf("The address of %f is %p.\n",*float_ptr,float_ptr);
	printf("\nThe character enterd is %u.\n",*char_ptr);
	printf("The address of %c is %p.\n",*char_ptr,char_ptr);
	
	printf("\n#####################################\n");
	
	//modifing actual value with their respective pointers
	printf("\nThe new value of whole number you entered was modified by adding 100.");
	*int_ptr=*int_ptr+100;
	printf("\nThe value is now %d.\n",*int_ptr);
	printf("The address is %p.\n",int_ptr);	
	printf("\nThe new value of decimal number you entered was modified by subtracting 50.");
	*float_ptr=*float_ptr-50;
	printf("\nThe value is now %f.\n",*float_ptr);
	printf("The address is %p.\n",float_ptr);
	printf("\nPlease enter a new keyboard character: ");
	//Here we are taking input two times becasue first character takes \n as input
	scanf("%c%c",char_ptr,char_ptr);
	printf("The new character you enterd is: %c\n",*char_ptr);
	printf("It's address is: %p",char_ptr);
	
	return 0;
}
