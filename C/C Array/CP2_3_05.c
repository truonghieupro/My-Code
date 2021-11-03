/*Nhập/Xuất một mảng từ bàn phím và in ra mảng ngược của mảng đó
Đầu vào: Thực hiện nhập từng phần tử của một mảng
Đầu ra: Hiển thị lại mảng đó và mảng ngược*/

#include<stdio.h>
void main()
{
	int n, arr[10];
	printf("nhap n= ");
	scanf_s("%d", &n);
	for (int i = 0; i < n; i++)
	{
		printf("nhap arr[%d]= ", i);
		scanf_s("%d", &arr[i]);
	}
	printf("mang do la: ");
	for (int i = 0; i < n; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\nmang nguoc mang do la: ");
	for (int i = n - 1; i >= 0; i--)
	{
		printf("%d ", arr[i]);
	}
}

