/*Bài tập tổng hợp*/
#include<stdio.h>
void main()
{
	int n, dem = 0, a[10];
	printf("nhap vao n= ");
	scanf_s("%d", &n);
	for (int i = 0; i < n; i++)
	{
		printf("\nnhap a[%d]= ", i);
		scanf_s("%d", &a[i]);
	}
	printf("cac chu so nguyen duong trong mang la: ");
	for (int i = 0; i < n; i++)
	{
		if (a[i] > 0)
		{
			printf("%d ", a[i]);
		}
	}
	printf("\ncac so co so chu so chia het cho 3 la: ");
	for (int i = 0; i < n; i++)
	{
		dem = 0;
		for (int j = a[i]; j > 0; j /= 10)
		{
			dem++;
		}
		if (dem % 3 == 0 && a[i] > 0)
		{
			printf("%d ", a[i]);
		}
	}
}