/*Vẽ tam giác ký tự*/
#include<stdio.h>
void InTamGiac(int n)
{
	for (int i = 1; i <= n; i++)
	{
		for (int j = 1; j <= 2 * i - 1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
}
void main()
{
	int n;
	printf("nhap n ");
	scanf_s("%d", &n);
	InTamGiac(n);
}
