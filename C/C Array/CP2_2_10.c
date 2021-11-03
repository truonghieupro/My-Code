/*Cho một mảng số nguyên gồm n phần tử. Hiển thị phần tử lớn nhất và lớn thứ 2 trong mảng

Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: Hiển thị phần tử lớn nhất và lớn thứ 2 trong mảng*/
#include<stdio.h>
void main()
{
	int n = 7, arr[] = { 1,2,3,4,5,6,7 };
	int max = arr[0], max2 = arr[1];
	for (int i = 0; i < n; i++)
	{
		if (arr[i] > max)
		{
			max = arr[i];
		}
	}
	printf("phan tu lon nhat trong mang la: %d ", max);
	for (int i = 0; i < n; i++)
	{
		if (arr[i] > max2 && arr[i] != max)
		{
			max2 = arr[i];
		}
	}
	printf("- lon thu hai trong mang la: %d", max2);
}