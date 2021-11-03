/*Nhập vào 2 mảng số nguyên bất kì. Hãy sắp xếp 2 mảng đó theo thứ tự tăng dần và trộn 2 mảng đó thành 1 mảng cũng theo thứ tự tăng dần
Đầu vào: Hai mảng số nguyên bất kì và số phần tử của hai mảng đó
Đầu ra: Một mảng mới thỏa mãn điều kiện chứa các phần tử của hai mảng cho trước và sắp xếp từ bé đến lớn*/
#include<stdio.h>
void main()
{
	int n, a[100];
	do
	{
		printf("nhap n>0 : ");
		scanf_s("%d", &n);
		if (n <= 0)
		{
			printf("\nnhap lai n\n");
		}
	} while (n <= 0);
	for (int i = 0; i < n; i++)
	{
		printf("\nnhap a[%d]= ", i);
		scanf_s("%d", &a[i]);
	}
	int m, b[100];
	do
	{
		printf("\nhap m>0 : ");
		scanf_s("%d", &m);
		if (m <= 0)
		{
			printf("\nnhap lai m\n");
		}
	} while (m <= 0);
	for (int i = 0; i < n; i++)
	{
		printf("\nnhap b[%d]= ", i);
		scanf_s("%d", &b[i]);
	}
	int s = n + m, c[100];
	int k = 0;
	for (int i = 0; i < n - 1; i++)
	{
		for (int j = i + 1; j < n; j++)
		{
			if (a[i] > a[j])
			{
				int x = a[i];
				a[i] = a[j];
				a[j] = x;
			}
		}
	}
	for (int i = 0; i < n - 1; i++)
	{
		for (int j = i + 1; j < n; j++)
		{
			if (b[i] > b[j])
			{
				int x = b[i];
				b[i] = b[j];
				b[j] = x;
			}
		}
	}
	for (int i = 0; i < n; i++)
	{
		c[k] = a[i];
		k++;
	}
	for (int i = 0; i < n; i++)
	{
		c[k] = b[i];
		k++;
	}
	for (int i = 0; i < s - 1; i++)
	{
		for (int j = i + 1; j < s; j++)
		{
			if (c[i] > c[j])
			{
				int h = c[i];
				c[i] = c[j];
				c[j] = h;
			}
		}
	}
	printf("\n");
	for (int i = 0; i < s; i++)
	{
		printf("%d ", c[i]);
	}
}