#include<stdio.h>
#include<math.h>
#define PI 3.141592654
int main()
{
	double angle;
	double x;
	printf("Enter an angle in degrees: ");
	scanf("%lf",&angle);
	angle = angle * (PI / 180.0);
	x=(3.0/4.0)*sin(angle)*cos(angle);
	printf("x=%lf\n",x);
	return (0);
}
