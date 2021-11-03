/*Bài toán liệt kê tổ hợp*/
#include<stdio.h>
void main()
{
	int n, a[100], b[100];
	printf("nhap n= ");
	scanf_s("%d", &n);
	for (int i = 0; i < n; i++)
	{
		a[i] = 0;
	}
	printf("\n");
	for (int i = 0; i < n; i++)
	{
		b[i] = 1;
	}
	int dem1 = -1;
	for (int y = 1; y <= n + 1; y++)
	{
		for (int x = 0; x < n; x++)
		{
			if (dem1 == x)
			{
				a[x] = 1;
				printf("%d", a[x]);
			}
			else
			{
				printf("%d", a[x]);
			}
			a[x] = 0;
		}
		printf("\n");
		dem1++;
	}
	int dem2 = -1;
	for (int y = 1; y <= n + 1; y++)
	{
		for (int x = 0; x < n; x++)
		{
			if (dem2 == x)
			{
				b[x] = 0;
				printf("%d", b[x]);
			}
			else
			{
				printf("%d", b[x]);
			}
			b[x] = 1;
		}
		printf("\n");
		dem2++;
	}
}