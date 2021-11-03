/*Cho một mảng số nguyên gồm n phần tử. Tính tổng các số dương trong mảng

Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: Hiển thị tổng các số nguyên dương trong mảng theo mẫu: Tong cac so duong trong mang la : [ tong ]*/

#include<stdio.h>
void main()
{
	int n = 5, tong = 0, arr[] = { 1,-2,3,4,5 };
	for (int i = 0; i < n; i++)
	{
		if (arr[i] > 0)
		{
			tong += arr[i];
		}
	}
	printf("\nTong cac so duong trong mang la: %d\n", tong);
}