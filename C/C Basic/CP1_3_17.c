#include<stdio.h>
#include<math.h>

void main()
{
	double x, f = 0;
	printf("nhap x: ");
	scanf_s("%lf", &x);
	if (x >= 5)
	{
		f = 2 * pow(x, 2) + 5 * x + 9;
	}
	else
	{
		f = -2 * pow(x, 2) + 4 * x - 9;
	}
	printf("ket qua phuong trinh la: %.1lf ", f);
}
