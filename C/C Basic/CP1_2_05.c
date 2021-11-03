#include<stdio.h>
void main()
{
	int a = 1, b = 2, c = 3, d = a;
	a = b;
	b = c;
	c = d;
	printf("%d %d %d", a, b, c);
}