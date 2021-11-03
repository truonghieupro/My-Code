#include<stdio.h>
void main()
{
	int n = 4;
	for (int y = 1; y <= n; y++)
	{
		for (int i = 1; i <= n * 2; i++)
		{
			printf("*");
		}
		printf("\n");
	}
}