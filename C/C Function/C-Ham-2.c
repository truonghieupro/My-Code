/*Viết hàm nhập, xuất mảng 1 chiều các số nguyên gồm n phần tử
Đầu vào: Mảng số nguyên, số phần tử n
Đầu ra: Nhập các giá trị cho mảng rồi in mảng vừa nhập ra màn hình*/
#include<stdio.h>
void NhapMang(int n, int a[])
{
	for (int i = 0; i < n; i++)
	{
		printf("nhap a[%d] = ", i);
		scanf_s("%d", &a[i]);
	}
}
void XuatMang(int n, int a[])
{
	for (int i = 0; i < n; i++)
	{
		printf("%d ", a[i]);
	}
}
void main()
{
	int n = 3, a[100];
	NhapMang(n, a);
	XuatMang(n, a);
}