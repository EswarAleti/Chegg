#include<iostream>
using namespace std;
int main()
{
	double pi = 3.141593;
	cout << "Enter two numbers: ";
	double a,b;
	cin >> a;
	cin >> b;
	cout << "Product is: " << a*b << endl;
	cout << "Enter Height and Width of the rectangle: ";
	double h,w;
	cin >> h;
	cin >> w;
	//Perimeter of rectangle is 2*(height+width)
	cout << "Perimeter of the rectangle is: " << 2*(h+w) << endl;
	cout << "Enter Radius of the circle: ";
	double r;
	cin >> r;
	//Perimeter of circle is 2*pi*radius
	cout << "Perimeter of the circle is: " << 2*pi*r << endl;
}
