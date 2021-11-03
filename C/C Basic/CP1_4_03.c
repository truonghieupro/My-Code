#include<stdio.h>
void main()
{
	int a = 2, n = 10, tong = 0;
	for (int d = 1; d <= 10; d++)
	{
		if (d % a == 0)
		{
			printf("%d ", d);

			tong += d;
		}

	}
	printf("\ntong cac so la %d", tong);
}