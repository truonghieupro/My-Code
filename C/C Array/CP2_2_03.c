/*Cho một mảng số nguyên, hãy sắp xếp mảng đó theo thứ tự từ bé đến lớn bằng thuật toán cái giỏ
Đầu vào: Một mảng số nguyên gồm n phần tử, mỗi phần tử có thể xuất hiện nhiều lần
Đầu ra: 1 mảng mởi với các phần tử đã được sắp xếp, các giá trị trùng nhau thì đứng cạnh nhau*/
#include<stdio.h>
void main()
{
	int n = 6, arr[] = { 1,4,6,3,2,4 };
	int gio[7] = { 0 };
	for (int i = 0; i < n; i++)
	{
		gio[arr[i]]++;
	}
	for (int i = 0; i < 7; i++)
	{
		if (gio[i] > 0)
		{
			for (int k = 0; k < gio[i]; k++)
			{
				printf("%d ", i);
			}
		}
	}
}