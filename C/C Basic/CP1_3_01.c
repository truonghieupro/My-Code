#include<stdio.h>
void main()
{
	int a;
	scanf_s("%d", &a);
	if (a % 2 == 0)
	{
		printf("%d la so chan", a);
	}
	else
		printf("%d la so le", a);
}