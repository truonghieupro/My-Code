// Bài toán vẽ hình chữ nhật rỗng
#include<stdio.h>
void main()
{
	int n = 5, m = 4; // m la so dong
	for (int a = 1; a <= m; a++)
	{
		for (int b = 1; b <= n; b++) // tren moi hang
		{
			if (b == 1 || b == n || a == 1 || a == m)
			{
				printf("*");
			}
			else
			{
				printf(" ");
			}
		}
		printf("\n");
	}
}