#include<stdio.h>
void main()
{
	int a = 1, b = 10;
	for (int i = 1; i <= b; i++)
	{
		if (i % 2 == 0)
		{
			printf(" %d", i);
		}
	}
}