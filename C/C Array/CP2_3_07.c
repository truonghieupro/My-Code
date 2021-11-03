/*Bài tập tổng hợp*/
#include<stdio.h>
void main()
{
	int n, tich = 1, a[100];
	printf("nhap vao n= ");
	scanf_s("%d", &n);
	for (int i = 0; i < n; i++)
	{
		printf("\nnhap a[%d]= ", i);
		scanf_s("%d", &a[i]);
	}
	printf("\ncac phan tu cua mang la: ");
	for (int i = 0; i < n; i++)
	{
		printf("%d ", a[i]);
	}
	printf("\ncac phan tu le la: ");
	for (int i = 0; i < n; i++)
	{
		if (a[i] % 2 != 0)
		{
			printf("%d ", a[i]);
		}
	}
	printf("\ncac so nguyen to le la: ");
	for (int i = 0; i < n; i++)
	{
		int dem = 0;
		if (a[i] > 2)
		{
			for (int j = 2; j <= a[i] / 2; j++)
			{
				if (a[i] % j == 0)
				{
					dem++;
					break;
				}
			}
			if (dem == 0)
			{
				printf("%d ", a[i]);
			}
		}
	}
	for (int i = 0; i < n; i++)
	{
		int dem = 0;
		if (a[i] > 2 && i % 2 == 0)
		{
			for (int j = 2; j <= a[i] / 2; j++)
			{
				if (a[i] % j == 0)
				{
					dem++;
					break;
				}
			}
			if (dem == 0)
			{
				tich *= a[i];
			}
		}
	}
	printf("\ntich cac so nguyen to o vi tri chan la: %d", tich);
}