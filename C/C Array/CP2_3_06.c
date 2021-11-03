/*Cho hai mảng số nguyên gồm n và m phần tử. Ghép hai mảng thành một mảng tăng dần duy nhất.
Đầu vào: Cho 2 mảng bất kì  đã sắp xếp và số phần tử của 2 mảng đó.
Đàu ra: Hiển thị 1 mảng là mảng gộp của hai mảng a, b với điều kiện các phần tử đã được sắp xếp theo thứ tự tăng dần*/
#include<stdio.h>
void main()
{
	int a[] = { 1,3,5,7 }, n = 4;
	int b[] = { 2,4,6,8,10 }, m = 5;
	int c[10], p = n + m;
	int k = 0;
	for (int i = 0; i < n; i++)
	{
		c[k] = a[i];
		k++;
	}
	for (int i = 0; i < m; i++)
	{
		c[k] = b[i];
		k++;
	}
	int g = 0;
	for (int i = 0; i < p; i++)
	{
		for (int j = 0; j <= i; j++)
		{
			if (c[j] > c[i])
			{
				g = c[i];
				c[i] = c[j];
				c[j] = g;
			}
		}
	}
	for (int i = 0; i < p; i++)
	{
		printf(" %d ", c[i]);
	}
}
