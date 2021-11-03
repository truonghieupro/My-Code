#include<stdio.h>
void main()
{
	int a = 1, b = 2;
	--a;
	++b;
	printf("%d %d", a, b);
	a -= b;
	b += a;
	printf("\n%d %d", a, b);

}