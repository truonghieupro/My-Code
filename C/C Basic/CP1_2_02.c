#include<math.h>
#include<stdio.h>

void main()
{
	double a = 1, b = 2, c = 3, d;
	d = sin(fabs(pow(a, (b - c))));
	printf("ket qua cua phep tinh la: %lf ", d);

}