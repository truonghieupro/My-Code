/*Cho sẵn mảng số nguyên N phần tử. Hãy in tổng của những phần tử ở vị trí lẻ trong mảng.

Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra : In ra màn hình tổng các phần tử ở vị trí lẻ trong mảng đó */

#include<stdio.h>
void main()
{
	int n = 8, tong = 0, arr[] = { 1,-2,3,4,5,-6,7,8 };
	for (int i = 1; i < n; i += 2)
	{
		tong += arr[i];
	}
	printf("tong cac phan tu trong mang la %d", tong);
}