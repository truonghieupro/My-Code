#include<stdio.h>
void main()
{
	int a = 1, b = 2;
	printf("%d+%d=%d\n", a, b, a + b);
	printf("%d-%d=%d\n", a, b, a - b);
	printf("%d*%d=%d\n", a, b, a * b);
	printf("%d/%d=%.2lf\n", a, b, a / (b * 1.0));
	printf("%d%%%d=%d", a, b, a % b);
}