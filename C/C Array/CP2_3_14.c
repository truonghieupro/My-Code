/*Nhập từ bàn phím 2 mảng số nguyên gồm n và m phần tử. Hãy đếm số phần tử chỉ xuất hiện ở 1 trong 2 mảng
Đầu vào: Hai mảng số nguyên tương ứng với n và m phần tử
Đầu ra: Hiển thị số phần tử chỉ xuất hiện ở một trong hai mảng*/
#include<stdio.h>
void main()
{
	int n, a[10];
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
	int m, b[10];
	do
	{
		printf("\nnhap m>0 : ");
		scanf_s("%d", &m);
		if (m <= 0)
		{
			printf("\nnhap lai m\n");
		}
	} while (m <= 0);
	for (int i = 0; i < m; i++)
	{
		printf("\nnhap b[%d]= ", i);
		scanf_s("%d", &b[i]);
	}
	int bdem1 = 0, bdem2 = 0;
	for (int i = 0; i < n; i++)
	{
		int dem = 0;
		for (int j = 0; j < m; j++)
		{
			if (a[i] == b[j])
			{
				dem++;
			}
		}
		if (dem == 0)
		{
			bdem1++;
		}
	}
	for (int i = 0; i < n - 1; i++)
	{
		for (int j = i + 1; j < n; j++)
		{
			if (a[i] == a[j])
			{
				bdem1--;
			}
		}
		if (bdem1 < 0)
		{
			bdem1 = 0;
		}
	}
	for (int i = 0; i < m; i++)
	{
		int dem = 0;
		for (int j = 0; j < n; j++)
		{
			if (b[i] == a[j])
			{
				dem++;
			}
		}
		if (dem == 0)
		{
			bdem2++;
		}
	}
	for (int i = 0; i < m - 1; i++)
	{
		for (int j = i + 1; j < m; j++)
		{
			if (b[i] == b[j])
			{
				bdem2--;
			}
		}
		if (bdem2 < 0)
		{
			bdem2 = 0;
		}
	}
	printf("\nSo phan tu chi xuat hien o 1 trong 2 mang la: %d", bdem1 + bdem2);
}